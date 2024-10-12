patterns:
    $phone = $regexp<(8|\+?7)-?\(?9\d{2}\)?-?\d{3}-?\d{2}-?\d{2}>
    $carEan = (* (Abarth*|AC*|Acura*|Adler*|GAC Aion*|Aito*|Aiways*|Aixam*|Alfa Romeo*|Alpina*|Alpine*|Амберавто*|Ambertruck*|AMC*|AM General*|Apal*|Arcfox*|Ariel*|Aro*|Asia*|Aston Martin*|Атом*|Auburn*|Audi*|Aurus*|Austin*|Austin Healey*|Autobianchi*|Auto Union*|Avatr*|Автокам*|BAIC*|Bajaj*|Baltijas Dzips*|Baojun*|Batmobile*|BAW*|Belgee*|Bentley*|Bertone*|Bilenkin*|Bio Auto*|Bitter*|Blaval*|BMW*|Borgward*|Brabus*|Brilliance*|Bristol*|Bufori*|Bugatti*|Buick*|BYD*|Byvin*|Cadillac*|Callaway*|Carbodies*|Caterham*|Chana*|Changan*|Changfeng*|Changhe*|CHERY*|EXEED*|Chevrolet*|Chrysler*|Ciimo (Dongfeng-Honda)*|Citroen*|Cizeta*|Coda*|Coggiola*|Cord*|Cupra*|Dacia*|Dadi*|Daewoo*|Daihatsu*|Daimler*|Dallara*|Datsun*|Dayun*|Deco Rides*|Delage*|DeLorean*|Denza*|Derways*|DeSoto*|De Tomaso*|DKW*|Dodge*|Dongfeng*|Doninvest*|Donkervoort*|DS*|DW Hower*|Eagle*|Eagle Cars*|Enovate (Enoreve)*|Everus*|Evolute*|Excalibur*|Exlantix*|E-Car*|Ё-мобиль*|Facel Vega*|FAW*|Ferrari*|Fiat*|Fisker*|Flanker*|Ford*|Forthing*|Foton*|Franklin*|FSO*|Fuqi*|GAC*|ГАЗ*|Geely*|Genesis*|Geo*|GMA*|GMC*|Goggomobil*|Gonow*|Gordon*|GP*|Great Wall*|Hafei*|Haima*|Hanomag*|Hanteng*|Haval*|Hawtai*|Heinkel*|Hennessey*|Hindustan*|HiPhi*|Hispano-Suiza*|Holden*|Honda*|Hongqi*|Horch*|Hozon*|HSV*|Huaihai (Hoann)*|HuangHai*|Huazi*|Hudson*|Hummer*|Hycan*|Hyundai*|iCar*|Иж*|IM Motors (Zhiji)*|Ineos*|Infiniti*|Innocenti*|International Harvester*|Invicta*|Iran Khodro*|Isdera*|Isuzu*|Iveco*|JAC*|Jaecoo*|Jaguar*|Jeep*|Jensen*|Jetour*|Jetta*|Jidu*|Jinbei*|JMC*|JMEV*|Jonway*|Kaiyi*|Канонир*|Karma*|Kawei*|KG Mobility*|Kia*|Knewstar*|Koenigsegg*|Комбат*|KTM AG*|KYC*|Lamborghini*|Lancia*|Landwind*|Land Rover*|Leapmotor*|LEVC*|Lexus*|Liebao Motor*|Lifan*|Ligier*|Lincoln*|Livan*|LiXiang*|Logem*|Lotus*|LTI*|ЛуАЗ*|Lucid*|Luxeed*|Luxgen*|Lynk & Co*|Mahindra*|Maple*|Marcos*|Marlin*|Marussia*|Maruti*|Maserati*|Matra*|Maxus*|Maybach*|Mazda*|McLaren*|Mega*|Mercedes-Benz*|Mercury*|Messerschmitt*|Metrocab*|MG*|Microcar*|Minelli*|Mini*|Mitsubishi*|Mitsuoka*|Mobilize*|Morgan*|Morris*|Москвич*|M-Hero*|Nash*|Nio*|Nissan*|Noble*|Oldsmobile*|OMODA*|Opel*|Ora*|Osca*|Oshan*|Oting*|Overland*|Packard*|Pagani*|Panoz*|Perodua*|Peugeot*|PGO*|Piaggio*|Pierce-Arrow*|Plymouth*|Polar Stone (Jishi)*|Polestar*|Pontiac*|Porsche*|Premier*|Спортивные авто и реплики*|Proton*|Puch*|Puma*|Qiantu*|Qingling*|Nevo*|Qoros*|Qvale*|Radar*|Ram*|Ravon*|Rayton Fissore*|Reliant*|Renaissance*|Renault*|Rezvani*|Rimac*|Rinspeed*|Rising Auto*|Rivian*|Roewe*|Rolls-Royce*|Ronart*|Rossa*|Rover*|Rox*|Руссо-Балт*|Saab*|Saipa*|Saleen*|Renault Samsung*|Santana*|Saturn*|Scion*|Sears*|SEAT*|Seres*|Shanghai Maple*|ShuangHuan*|Simca*|Skoda*|Skywell*|Skyworth*|Smart*|СМЗ*|Solaris*|Sollers*|Soueast*|Spectre*|Spyker*|SsangYong*|Stelato*|Steyr*|Studebaker*|Subaru*|Suzuki*|SWM*|ТагАЗ*|Talbot*|Tank*|Tata*|Tatra*|Tazzari*|Tesla*|Thairung*|Think*|Tianma*|Tianye*|Tofas*|Toyota*|Trabant*|Tramontana*|Triumph*|GAC Trumpchi*|TVR*|УАЗ*|Ultima*|Vauxhall*|Lada (ВАЗ)*|Vector*|Venturi*|Venucia*|VGV*|VinFast*|Volga*|Volkswagen*|Volvo*|Vortex*|Voyah*|VUHL*|Wanderer*|Wartburg*|Weltmeister*|Westfield*|Wey*|Wiesmann*|Willys*|Wuling*|W Motors*|Xcite*|XEV*|Xiaomi*|XiaoPaoChe (SSC)*|Xin Kai*|Xpeng*|Yema*|Yipai*|Yulon*|Zastava*|ЗАЗ*|Zeekr*|Zenos*|Zenvo*|Zibar*|ЗИЛ*|ЗиС*|Zotye*|ZX*) *)
    $carRus = (* (Абарт*|АС*|Акура*|Адлер*|ГАК Аион*|Аито*|Айвэйс*|Аиксам*|Альфа Ромео*|Альпина*|Альпин*|Амберавто*|Амбертрак*|АМС*|АМ Дженерал*|Апал*|Аркфокс*|Ариэль*|Аро*|Эйша*|Астон Мартин*|Атом*|Оберн*|Ауди*|Аурус*|Остин*|Остин Хэйли*|Аутобьянки*|Авто Юнион*|Аватр*|Автокам*|БАИК*|Баджадж*|Балтиас Джипс*|Баоджун*|Бэтмобиль*|БАВ*|Белджи*|Бентли*|Бертоне*|Биленкин*|Био Авто*|Биттер*|Блавал*|БМВ*|Боргвард*|Брабус*|Бриллианс*|Бристоль*|Буфори*|Бугатти*|Бьюик*|БИД*|Бивин*|Кадиллак*|Каллавей*|Карбодис*|Катерхем*|Чана*|Чанган*|Чанфэн*|Чанхэ*|Чери*|Эксид*|Шевроле*|Крайслер*|Циимо*|Ситроен*|Чизета*|Кода*|Коджиола*|Корд*|Купра*|Дачия*|Дади*|Дэу*|Дайхатсу*|Даймлер*|Даллара*|Датсун*|Даюн*|Деко Райдс*|Делаж*|ДеЛориан*|Денза*|Дервейс*|Десото*|Де Томазо*|ДКВ*|Додж*|ДонгФенг*|Донинвест*|Донкервурт*|ДС*|ДВ Ховер*|Игл*|Игл Карс*|Эновате*|Эверус*|Эволют*|Экскалибур*|Экслантикс*|Е-Кар*|Ё-мобиль*|Фэйсл Вега*|ФАВ*|Феррари*|Фиат*|Фискер*|Фланкер*|Форд*|Форфинг*|Фотон*|Франклин*|ФСО*|Фучи*|ГАК*|ГАЗ*|Джили*|Генезис*|Гео*|Джи-Эм-Эй*|Джи-Эм-Си*|Гоггомобил*|Гонов*|Гордон*|ГП*|Грейт Вол*|Хафэй*|Хайма*|Ханомаг*|Хантенг*|Хавэйл*|Хаутай*|Хейнкель*|Хеннесси*|Хиндустан*|Хипхи*|Испано-Сюиза*|Холден*|Хонда*|Хончи*|Хорьх*|Хозон*|ХСВ*|Хуайхай (Хоанн)*|ХуангХай*|Хуацзы*|Хадсон*|Хаммер*|Хикан*|Хендэ*|ИКар*|ИЖ*|Им Моторс*|Инеос*|Инфинити*|Инноченти*|Интернейшионал Харвестер*|Инвикта*|Иран Ходро*|Исдера*|Исузу*|Ивеко*|Джак*|Джейку*|Ягуар*|Джип*|Дженсен*|Джитур*|Джетта*|Джиду*|Джинбей*|Джей Эм Си*|Джмев*|Джонвэй*|Каи*|Канонир*|Карма*|Кавэй*|Кей-Джи-Мобилити*|Киа*|Ньюстар*|Кёнигсегг*|Комбат*|КТМ АГ*|КУС*|Ламборгини*|Лянча*|Лендвинд*|Ленд Ровер*|Липмотор*|ЛЕВК*|Лексус*|Лиебао Мотор*|Лифан*|Лижье*|Линкольн*|Ливан*|Лисян*|Логем*|Лотус*|ЛТИ*|ЛУАЗ*|Люсид*|Люксид*|Люксген*|Линк и ко*|Махиндра*|Мэйпл*|Маркос*|Марлин*|Маруся*|Марути*|Мазерати*|Матра*|Максус*|Майбах*|Мазда*|МакЛарен*|Мега*|Мерседес-Бенц*|Меркури*|Мессершмитт*|Метрокэб*|Эм-Джи*|Микрокар*|Минелли*|Мини*|Митсубиси*|Мицуока*|Мобилайз*|Морган*|Моррис*|Москвич*|М-Хиро*|Нэш*|Нио*|Ниссан*|Нобл*|Олдсмобиль*|Омода*|Опель*|Ора*|Оска*|Ошан*|Отинг*|Оверлэнд*|Паккард*|Пагани*|Паноз*|Перодуа*|Пежо*|ПГО*|Пьяджо*|Пирс-Арроу*|Плимут*|Полар Стоун*|Полестар*|Понтиак*|Порше*|Премьер*|Спортивные авто и Реплики*|Протон*|Пух*|Пума*|Кианту*|Цинлин*|Нево*|Куорос*|Куали*|Радар*|Рам*|Равон*|Рэйтон Физзоре*|Релайент*|Ренессанс*|Рено*|резвани*|Римак*|Ринспид*|Райзинг Авто*|Ривиан*|Роев*|Роллс-Ройс*|Ронарт*|Росса*|Ровер*|Рокс*|Руссо-Балт*|Сааб*|Сайпа*|Салин*|Рено Самсунг*|Сантана*|Сатурн*|Сайон*|Сирс*|Сеат*|Серес*|Шанхай Мапл*|Шунган*|Симка*|Шкода*|Скайвэлл*|Скайворт*|Смарт*|СМЗ*|Солярис*|Соллерс*|Соуист*|Спектр*|Спайкер*|Ссанъён*|стелато*|Штайр*|Студебейкер*|Субару*|Сузуки*|СВМ*|ТагАЗ*|Толбет*|Танк*|ТАТА*|Татра*|Таззари*|Тесла*|Тайрунг*|Синк*|Тианма*|Тианье*|Тофаш*|Тойота*|Трабант*|Трамонтана*|Триумф*|Трампчи*|ТВР*|УАЗ*|Ультима*|Воксхолл*|Лада*|Вектор*|Вентури*|Венуция*|ВГВ*|Винфаст*|Волга*|Фольксваген*|Вольво*|Вортекс*|Воя*|Вухл*|Вандерер*|Вартбург*|Велтмейстер*|Вестфилд*|Вей*|Вайсман*|Виллис*|Вулинг*|дабл-ю моторс*|Иксайт*|Ксев*|Ксиоми*|КсиаоПаоЧе*|Ксин Кай*|Икспенг*|Йема*|Ипай*|Юлон*|Застава*|ЗАЗ*|Зикр*|Зенос*|Зенво*|Зибар*|ЗИЛ*|ЗиС*|Зоти*|ЗХ*) *)