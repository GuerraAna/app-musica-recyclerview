package br.com.appmusica

import br.com.appmusica.models.Video

class DataSource {
    companion object {
        fun createDataSet(): ArrayList<Video> {
            val list = arrayListOf<Video>()
            list.add(
                Video(
                    tittle = "Essa Pequena",
                    author = "Chico Buarque",
                    thumbnailUrl = "https://img.youtube.com/vi/GoUDZlmIXOk/0.jpg",
                    link = "https://www.youtube.com/watch?v=GoUDZlmIXOk"
                )
            )
            list.add(
                Video(
                    tittle = "Eu não sou racista | Prod. DropAllien",
                    author = "Nego Max",
                    thumbnailUrl = "https://img.youtube.com/vi/v2DCHWp2XyA/0.jpg",
                    link = "https://www.youtube.com/watch?v=v2DCHWp2XyA"
                )
            )
            list.add(
                Video(
                    tittle = "Meu Limão Meu Limoeiro",
                    author = "Wilson Simonal",
                    thumbnailUrl = "https://img.youtube.com/vi/qoBkkFTO-Xc/0.jpg",
                    link = "https://www.youtube.com/watch?v=qoBkkFTO-Xc&t=92s"
                )
            )
            list.add(
                Video(
                    tittle = "Te vi na rua ontem .mp3",
                    author = "Konai",
                    thumbnailUrl = "https://img.youtube.com/vi/1Xfs6OzGfWA/0.jpg",
                    link = "https://www.youtube.com/watch?v=1Xfs6OzGfWA"
                )
            )
            list.add(
                Video(
                tittle = "The Scientist",
                author = "Coldplay",
                thumbnailUrl = "https://img.youtube.com/vi/RB-RcX5DS5A/0.jpg",
                link = "https://www.youtube.com/watch?v=RB-RcX5DS5A"
                )
            )
            list.add(
                Video(
                    tittle = "Creep",
                    author = "Radiohead",
                    thumbnailUrl = "https://img.youtube.com/vi/XFkzRNyygfk/0.jpg",
                    link = "https://www.youtube.com/watch?v=XFkzRNyygfk"
                )
            )
            list.add(
                Video(
                    tittle = "Lost On You [Live Session]",
                    author = "LP",
                    thumbnailUrl = "https://img.youtube.com/vi/wDjeBNv6ip0/0.jpg",
                    link = "https://www.youtube.com/watch?v=wDjeBNv6ip0"
                )
            )
            list.add(
                Video(
                    tittle = "Take Me To Church (Official Video)",
                    author = "Hozier",
                    thumbnailUrl = "https://img.youtube.com/vi/PVjiKRfKpPI/0.jpg",
                    link = "https://www.youtube.com/watch?v=PVjiKRfKpPI"
                )
            )
            return list
        }
    }

}