package typingsSlinky.yesql.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Text[TParams /* <: js.Object */] extends js.Object {
  var text: String = js.native
  var values: js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: TParams[keyof TParams] */ js.Any
  ] = js.native
}

object Text {
  @scala.inline
  def apply[TParams](
    text: String,
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: TParams[keyof TParams] */ js.Any
    ]
  ): Text[TParams] = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Text[TParams]]
  }
  @scala.inline
  implicit class TextOps[Self[tparams] <: Text[tparams], TParams] (val x: Self[TParams]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TParams] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TParams]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TParams] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TParams] with Other]
    @scala.inline
    def withText(value: String): Self[TParams] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: TParams[keyof TParams] */ js.Any
        ]
    ): Self[TParams] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

