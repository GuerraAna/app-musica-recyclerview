package br.com.appmusica

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.appmusica.models.Video
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.res_item_video.view.*
import java.util.ArrayList

class VideoAdapter(private val onItemClicked: (Video) -> Unit): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var itens: List<Video> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        //Infla o Layout do item no xml.
        return VideoViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.res_item_video, parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder) {
            is VideoViewHolder -> {
                holder.bind(itens[position], onItemClicked)
            }
        }
    }

    override fun getItemCount(): Int {
        return itens.size
    }

    //Recebe os dados do video e atribui ao item
    fun setDataSet(video: List<Video>) {
        this.itens = video
    }


    //Trazer os id's do Layout e compará-los com os dados.
    class VideoViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        //Novo objeto = ID Layout.
        private val videoTitle = itemView.tv_title
        private val videoAuthor = itemView.tv_author
        private val videoThumbnail = itemView.thumbnail

        fun bind(video: Video, onItemClicked: (Video) -> Unit) {
            //Objeto do ID = Objeto mockado.
            videoTitle.text = video.tittle
            videoAuthor.text = video.author
            //Utiliza o Glide para o carregamento da imagem.
            val requestOptions = RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)

            Glide.with(itemView.context)
                .applyDefaultRequestOptions(requestOptions)
                .load(video.thumbnailUrl)
                .into(videoThumbnail)

            itemView.setOnClickListener {
                onItemClicked(video)
            }
        }
    }
}