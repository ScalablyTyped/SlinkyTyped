package typingsSlinky.spectacle.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarkdownProps extends js.Object {
  var mdastConfig: js.UndefOr[StringDictionary[Double | String]] = js.native
  var source: js.UndefOr[String] = js.native
}

object MarkdownProps {
  @scala.inline
  def apply(): MarkdownProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkdownProps]
  }
  @scala.inline
  implicit class MarkdownPropsOps[Self <: MarkdownProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMdastConfig(value: StringDictionary[Double | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mdastConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMdastConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mdastConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
  }
  
}

