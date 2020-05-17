package typingsSlinky.uifabricMergeStyles.istyleMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.uifabricMergeStyles.irawstylebaseMod.IRawStyleBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRawStyle
  extends IRawStyleBase
     with IStyleBase {
  /**
    * Display name for the style.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * Custom selectors for the style.
    */
  var selectors: js.UndefOr[StringDictionary[IStyle]] = js.native
}

object IRawStyle {
  @scala.inline
  def apply(): IRawStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRawStyle]
  }
  @scala.inline
  implicit class IRawStyleOps[Self <: IRawStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectors(value: StringDictionary[IStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectors")(js.undefined)
        ret
    }
  }
  
}

