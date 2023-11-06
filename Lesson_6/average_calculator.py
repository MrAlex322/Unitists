class AverageCalculator:
    """
    Класс для вычисления среднего значения списка чисел.
    """

    def calculate_average(self, numbers):
        """
        Вычисляет среднее значение списка чисел.

        Args:
            numbers (list): Список чисел.

        Returns:
            float: Среднее значение чисел. Если список пуст, возвращает 0.

        Example:
            calculator = AverageCalculator()
            average = calculator.calculate_average([1, 2, 3])
        """
        if not numbers:
            return 0
        return sum(numbers) / len(numbers)

def compare_averages(list1, list2):
    """
    Сравнивает средние значения двух списков и возвращает сообщение.

    Args:
        list1 (list): Первый список чисел.
        list2 (list): Второй список чисел.

    Returns:
        str: Сообщение, указывающее, какой список имеет большее среднее значение или что средние значения равны.

    Example:
        result = compare_averages([1, 2, 3], [4, 5, 6])
        """
    calculator = AverageCalculator()
    avg1 = calculator.calculate_average(list1)
    avg2 = calculator.calculate_average(list2)

    if avg1 > avg2:
        return "Первый список имеет большее среднее значение"
    if avg2 > avg1:
        return "Второй список имеет большее среднее значение"
    return "Средние значения равны"


