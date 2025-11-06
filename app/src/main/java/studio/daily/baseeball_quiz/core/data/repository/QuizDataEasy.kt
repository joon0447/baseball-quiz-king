package studio.daily.baseeball_quiz.core.data.repository

import studio.daily.baseeball_quiz.core.model.Quiz
import studio.daily.baseeball_quiz.feature.createquiz.model.Difficulty

val easyQuizList = listOf(
    Quiz(
        id = 1,
        difficulty = Difficulty.EASY,
        question = "야구에서 공을 던지는 선수를 무엇이라고 할까?",
        options = listOf("투수", "포수", "타자", "심판"),
        answerIndex = 1,
        explanation = "투수는 공을 던지고, 포수는 공을 받고, 타자는 공을 칩니다. 심판은 경기의 판정을 내리는 역할을 합니다."
    ),
    Quiz(
        id = 2,
        difficulty = Difficulty.EASY,
        question = "야구에서 공을 치는 사람은 누구일까?",
        options = listOf("심판", "타자", "주자", "코치"),
        answerIndex = 2,
        explanation = "심판은 경기의 판정을 내리는 역할을 합니다, 타자는 공을 치고, 주자는 달리고, 코치는 선수에게 지시를 내립니다."
    ),
    Quiz(
        id = 3,
        difficulty = Difficulty.EASY,
        question = "야구 경기에서 한 팀은 몇 명의 선수가 수비를 할까?",
        options = listOf("7명", "8명", "9명", "10명"),
        answerIndex = 3,
        explanation = "수비는 포수, 투수, 1루수, 2루수, 유격수, 3루수, 좌익수, 우익수, 중견수 총 9명입니다."
    ),
    Quiz(
        id = 4,
        difficulty = Difficulty.EASY,
        question = "야구 경기에서 공을 던지는 곳을 뭐라고 부를까?",
        options = listOf("베이스", "마운드", "덕아웃", "홈런존"),
        answerIndex = 2,
        explanation = "투수가 야구장에서 투구할 때 밟고 올라서는 투수판을 중심으로 한 다른 곳보다 조금 높은 지형 문자 그대로 언덕처럼 생겼기에 언덕(mound)이라 부릅니다."
    ),
    Quiz(
        id = 5,
        difficulty = Difficulty.EASY,
        question = "오른손 잡이 야구 선수는 글러브를 어느 쪽 손에 착용할까?",
        options = listOf("오른손", "왼손", "양손", "착용안함"),
        answerIndex = 1,
        explanation = "오른손 잡이 선수는 오른손으로 공을 던지고, 왼손에 글러브를 착용하고 공을 받습니다."
    ),
    Quiz(
        id = 6,
        difficulty = Difficulty.EASY,
        question = "홈런을 치면 타자는 어디까지 뛸까?",
        options = listOf("1루", "2루", "3루", "홈"),
        answerIndex = 4,
        explanation = "홈런이라는 말그대로, 1루,2루,3루를 모두 돌아 홈으로 옵니다."
    ),
    Quiz(
        id = 7,
        difficulty = Difficulty.EASY,
        question = "1루, 2루, 3루를 모두 돌고 홈에 들어오면 몇 점일까?",
        options = listOf("1점", "2점", "3점", "4점"),
        answerIndex = 1,
        explanation = "홈에서부터 시작해서 홈으로 1바퀴 돌아오면 1점을 득점합니다."
    ),
    Quiz(
        id = 8,
        difficulty = Difficulty.EASY,
        question = "야구 경기의 한 회를 무엇이라고 부를까?",
        options = listOf("세트", "이닝", "라운드", "타임"),
        answerIndex = 2,
        explanation = "이닝(inning)은 기본 경기 단위로, 1개의 이닝에 초/말 반으로 나누어 진행됩니다."
    ),
    Quiz(
        id = 9,
        difficulty = Difficulty.EASY,
        question = "야구에서 \"스트라이크\"는 어떤 상황일까?",
        options = listOf("투수가 던진 공이 타자의 얼굴 높이로 날라왔을 때",
            "타자가 헛스윙 했을 때",
            "투수가 던진 공이 타자의 발 높이로 날라왔을 때",
            "공이 타자의 몸에 맞을 때"),
        answerIndex = 2,
        explanation = "스트라이크는 스트라이크 존에 공이 들어오거나, 헛스윙을 하거나, 파울을 쳤을 때(2스트라이크 이전)의 경우가 해당됩니다."
    ),
    Quiz(
        id = 10,
        difficulty = Difficulty.EASY,
        question = "타자가 세 번 스트라이크를 당하면?",
        options = listOf("볼넷", "홈런", "아웃", "세이프"),
        answerIndex = 3,
        explanation = "스트라이크 카운트가 3개가 되면 아웃이 되며, 이를 `삼진`이라고 부릅니다."
    ),
    Quiz(
        id = 11,
        difficulty = Difficulty.EASY,
        question = "프로야구 선수가 사용하는 배트의 재질은?",
        options = listOf("플라스틱", "나무", "스테인리스", "철"),
        answerIndex = 2,
        explanation = "프로야구 선수는 나무 배트를 사용합니다."
    ),
    Quiz(
        id = 12,
        difficulty = Difficulty.EASY,
        question = "야구에서 \"포수\"의 주 역할은?",
        options = listOf("공 던지기", "공 잡기", "타격", "작전 지시"),
        answerIndex = 2,
        explanation = "포수는 투수가 던진 공을 잡는 역할을 합니다."
    ),
    Quiz(
        id = 13,
        difficulty = Difficulty.EASY,
        question = "야구에서 \"세이프\"가 되는 상황은?",
        options = listOf("주자가 아웃되지 않음", "홈런을 침", "경기 종료", "스트라이크"),
        answerIndex = 1,
        explanation = "세이프는 주자가 공보다 빨리 베이스를 밟았을 때를 칭합니다."
    ),
    Quiz(
        id = 14,
        difficulty = Difficulty.EASY,
        question = "야구에서 \"아웃\"이 되는 상황은?",
        options = listOf("주자가 득점함", "타자가 친 공이 바운드가 되어 수비수에게 잡힘", "타자가 친 공이 관중석으로 날라감", "주자가 공보다 늦게 베이스를 밟음"),
        answerIndex = 4,
        explanation = "주자가 공보다 늦게 베이스를 밟을 때 아웃 처리가 됩니다."
    ),
    Quiz(
        id = 15,
        difficulty = Difficulty.EASY,
        question = "한 팀의 공격이 끝나려면 몇 명이 아웃되어야 할까?",
        options = listOf("2명", "3명", "4명", "5명"),
        answerIndex = 2,
        explanation = "한 이닝의 아웃 카운트는 총 3개입니다."
    ),
    Quiz(
        id = 16,
        difficulty = Difficulty.EASY,
        question = "프로야구에서 한 경기의 기본 이닝 수는?",
        options = listOf("7이닝", "8이닝", "9이닝", "10이닝"),
        answerIndex = 3,
        explanation = "프로야구의 정규 이닝은 9이닝입니다."
    ),
    Quiz(
        id = 17,
        difficulty = Difficulty.EASY,
        question = "야구에서 \"홈런\"이란?",
        options = listOf("공을 멀리 던지는 것", "공을 잡는 것", "친 공이 외야 담장 밖으로 넘어가는 것", "홈에서 아웃되는 것"),
        answerIndex = 3,
        explanation = "타자가 친 공이 외야 담장 밖으로 날아가는 경우가 우리가 흔히 볼 수 있는 홈런입니다. 이 밖에 담장을 넘어가지 않았지만, 타자가 빠르게 달려 홈까지 들어올 때도 홈런이 됩니다."
    ),
    Quiz(
        id = 18,
        difficulty = Difficulty.EASY,
        question = "더그아웃은 어디일까?",
        options = listOf("관중석", "심판석", "선수들이 대기하는 자리", "기자석"),
        answerIndex = 3,
        explanation = "선수들 뿐 아니라 감독, 코치 등의 스태프 모두가 있는 자리를 더그아웃이라고 합니다."
    ),
    Quiz(
        id = 19,
        difficulty = Difficulty.EASY,
        question = "타자가 친 공이 땅에 닿기 전에 수비수가 잡으면?",
        options = listOf("홈런", "볼넷", "삼진", "플라이아웃"),
        answerIndex = 4,
        explanation = "공이 그라운드에 닿지 않고 노바운드로 한 번에 야수가 잡는데 성공하면 플라이 아웃으로, 잡는 즉시 아웃이 선언됩니다."
    ),
    Quiz(
        id = 20,
        difficulty = Difficulty.EASY,
        question = "한국 프로야구(KBO)는 몇 개 구단으로 구성되어 있을까? (2025년 기준)",
        options = listOf("8개", "9개", "10개", "12개"),
        answerIndex = 3,
        explanation = "2025년 기준 한국 프로야구 구단은 총 10개 입니다."
    ),
)