package mate.academy
//У цьому завданні створіть локальну функцію, яка:
//запитує у користувача ім'я (з консолі),]
// доки не буде введено порожній рядок;
//друкує привітання для кожного імені , наприклад, Hello, Alex!.
//Ось приклад послідовності виконання програми:
//Please enter a name (or press Enter to quit):
//Bob
//Hello, Bob!
//Please enter a name (or press Enter to quit):
//Alice
//Hello, Alice!
//Process finished with exit code 0
fun greetUsers() {
    var name: String? = null
    val trimmedName = name?.trim()
    name = readLine()
    do {
        print("Please enter a name (or press Enter to guit): ")
        if (!trimmedName.isNullOrEmpty()) {
            println("Hello, $trimmedName!")
        }
    } while (!trimmedName.isNullOrEmpty())
    // implement function
}

fun main() {
    greetUsers()
}
