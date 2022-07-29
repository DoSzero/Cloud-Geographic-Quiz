package com.quizapp


object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    
    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1 +++
        val que1 = Question(
            1, "Что является столицей Австралии?",
            R.drawable.ic_flag_of_australia,
            "Канберра", "Сидней",
            "Аделаида", "Мельбурн", 1
        )
        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, " Какая страна является самой подверженной землетрясениям страной в мире?",
            R.drawable.ic_earthquake,
            "Малайзия", "Япония",
            "Корея", "Тайвань", 2
        )
        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "Как называется самый маленький океан??",
            R.drawable.icsea,
            "Северный Ледовитый ", "Тихий ",
            "Индийский ", "Атлантический", 1
        )
        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "Какая река протекает через Париж?",
            R.drawable.ic_fra,
            "Река Гудзон", "Река Сена",
            "Река Рейн", "Река Миссисипи", 2
        )
        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, " Какая единственная страна граничит с Великобританией?",
            R.drawable.ic_london,
            "Швеция", "Австрия",
            "Германия", "Ирландия", 4
        )
        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "Где находится “Испанская лестница”?",
            R.drawable.ic_spa_holder,
            "Италия", "Бразилия",
            "Испания", "Австрия", 1
        )
        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "Сколько стран находится внутри Соединенного Королевства?",
            R.drawable.ic_uk_parts,
            "Три", "Пять",
            "Четыре", "Шесть", 3
        )
        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "Какая страна имеет аббревиатуру “CH”",
            R.drawable.ic_switzer,
            "Китай", "Швейцария",
            "Куба", "Чили", 2
        )
        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "Какой самый большой остров в мире?",
            R.drawable.ic_island,
            "Исландия", "Гренландия",
            "Финляндия", "Ирландия", 2
        )
        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "Какая страна претендует на горы Эверест? ",
            R.drawable.ic_everest,
            "Колумбия", "Швейцария",
            "Непал", "Венесуэла", 3
        )
        questionsList.add(que10)

        return questionsList
    }
}