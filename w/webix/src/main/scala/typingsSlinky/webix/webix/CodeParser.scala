package typingsSlinky.webix.webix

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeParser extends js.Object {
  def collapseNames(obj: js.Any): StringDictionary[js.Any] = js.native
  def expandNames(obj: StringDictionary[js.Any]): js.Any = js.native
}

object CodeParser {
  @scala.inline
  def apply(collapseNames: js.Any => StringDictionary[js.Any], expandNames: StringDictionary[js.Any] => js.Any): CodeParser = {
    val __obj = js.Dynamic.literal(collapseNames = js.Any.fromFunction1(collapseNames), expandNames = js.Any.fromFunction1(expandNames))
    __obj.asInstanceOf[CodeParser]
  }
  @scala.inline
  implicit class CodeParserOps[Self <: CodeParser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollapseNames(value: js.Any => StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseNames")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExpandNames(value: StringDictionary[js.Any] => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandNames")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

