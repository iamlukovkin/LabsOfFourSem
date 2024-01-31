"""Работа над директориями."""

import os
from docx import Document


disciplines: dict = {
    'ПП': 'Промышленное програмирование',
    'СиТ': 'Сети и телекоммуникации',
    'ОС': 'Операционные системы',
    "ИГ": "Инженерная графика",
    "ИЯ": 'Иностранные язык',
    "ОТВС": 'Основы теории вычислительных систем',
    "ДМ": 'Дискретная математика',
    "ОЭ": 'Основы электроники',
    "ЭВМиПУ": 'Электронные вычислительные машины и периферийные устройства',
}

sub_dirs: list = ["ЛР", "ПР", "МУ"]

for discipline in disciplines.values():
    if not os.path.exists(discipline):
        os.mkdir(discipline)
    for sub in sub_dirs:
        if not os.path.exists(
            os.path.join(discipline, sub)):
            os.mkdir(os.path.join(discipline, sub))
            if sub not in ('МУ', 'Конспекты'):
                os.mkdir('{}/Отчеты'.format(os.path.join(discipline, sub)))
        if sub == "ЛР":
            for index in range(1, 13):
                os.system(f'cp ".assets/otchet.docx" "{discipline}/{sub}/Отчеты/ЛР-{index}.docx"')
        if sub == "ПР":
            for index in range(1, 13):
                os.system(f'cp ".assets/otchet.docx" "{discipline}/{sub}/Отчеты/ПР-{index}.docx"')
