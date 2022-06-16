## static
    static キーワードつけると内部のスコープからでも変数が参照できない(これ間違ってるかも)
    https://docs.oracle.com/javase/tutorial/java/javaOO/classvars.html

    staticがついたmehodはインスタンスを生成しなくても呼び出せる。
    staticクラスのsetterを外部から呼び出すとclass自体が変わる？（設計図自体が変わるイメージ？次にインスタンスかを行うと、そのインスタンスは既に変わったものを参照するのか->まだ試せていない）

## place folder
    %C,%S...: input が小文字でも大文字がreturn

## main method
    プロジェクトで1つにする(のが望ましい)

## String.substring
similar to slice in JS(extract string and it doesnt affect original one)

## abstruct
superクラスがabstract methodを持つとsub クラス全部がabstruct method  を implementする必要がある
(super class自体はmethodをimplementする必要はない)
特定のmethodだけをimplementさせたい場合はinterfaceを作成すると解決？
## interface
interface can achieve multiple inheritence



## reference
- [【初心者向け】Javaのstaticメソッド・static変数について解説！](https://www.tech-teacher.jp/blog/java-static/#:~:text=static%E3%83%A1%E3%82%BD%E3%83%83%E3%83%89%E3%81%A8%E3%81%AF%E3%80%81%E3%82%A4%E3%83%B3%E3%82%B9%E3%82%BF%E3%83%B3%E3%82%B9,%E3%81%A8%E3%82%82%E5%91%BC%E3%81%B0%E3%82%8C%E3%81%A6%E3%81%84%E3%81%BE%E3%81%99%E3%80%82)