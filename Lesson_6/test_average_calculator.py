import pytest
from average_calculator import compare_averages

def test_compare_averages():
    assert compare_averages([1, 2, 3], [4, 5, 6]) == "Второй список имеет большее среднее значение"
    assert compare_averages([1, 2, 3], [1, 2, 3]) == "Средние значения равны"
    assert compare_averages([], [4, 5, 6]) == "Первый список имеет большее среднее значение"

if __name__ == "__main__":
    pytest.main()
