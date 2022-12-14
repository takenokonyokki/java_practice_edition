//変数へのメソッド参照の格納
//変数名　＝　クラス名：：そのクラスの静的メソッド名　メソッド名の後ろに()を付けない
//変数名　＝　インスタンス変数名：：そのインスタンスのメソッド名　メソッド名の後ろに()を付けない

//ラムダ式
//(型　引数名１, 型　引数名２, ・・・) -> {
	//処理;
	//　：
	//return 戻り値;
//}

//例１　勇者インスタンスを受け取り、そのHPを返す
//(Hero h) -> {
	//return h.get.Hp();
//}

//ラムダ式の省略記法
//①代入時はラムダ式の引数宣言における型を省略可能
//②ラムダ式の引数が１つの場合は丸カッコを省略可能
//③ラムダ式が単一のreturnの場合、波カッコとreturnを省略可能