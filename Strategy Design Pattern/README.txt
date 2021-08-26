Strategy Design Pattern:
    + Vấn Đề: phương thức(Đoạn xữ lý) của một đối tượng thường phải thay đổi nhiều lần và ở nhiều nơi trong hệ thống.
    + Giả Quyết: tạo ra từng nhóm riêng tách rời với hệ thống.
    + Ưu Điểm: Tách ra khỏi hệ thống chính, không bị phụ thuộc (EDIT ONE FOR ALL), thay đổi được trong lúc runtime.

                                        |--------------------------------------|
                                        |                TICKET                |
                                        |--------------------------------------|
                                        | -price: double                       |
                                        | -promoteStrategy: PromoteStrategy    |
                                        | -name:string                         |
                           |---------------------------------------------------------------------|
                           |      +SetPromoteStrategy(promoteStrategy: PromoteStrategy): void    |
                           |      +SetPrice(price: double): void                                 |
                           |      +GetPromoted(): double                                         |
                           |_____________________________________________________________________|
                                                            ^
                                                            |
                                                            |
                                        |-------------------------------------|
                                        |            <<interface>>            |
                                        |           IPromoteStrategy          |
                                        |-------------------------------------|
                ----------------------->| +DoDiscount(price: double): double  |<-------------------------
                |                       |_____________________________________|                         |
                |                                          ^                                            |
                |                                          |                                            |
                |                                          |                                            |
                |                                          |                                            |
|-------------------------------------|       |--------------------------------------|      |--------------------------------------|
|        NoDiscountStrategy           |       |        QuarterDiscountStrategy       |      |          HalfDiscountStrategy        |
|_____________________________________|       |--------------------------------------|      |--------------------------------------|
| + DoDiscount(price: double): double |       |  + DoDiscount(price: double): double |      |  + DoDiscount(price: double): double |
|_____________________________________|       |______________________________________|      |______________________________________|