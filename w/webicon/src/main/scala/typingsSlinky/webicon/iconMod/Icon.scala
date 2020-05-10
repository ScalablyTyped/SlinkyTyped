package typingsSlinky.webicon.iconMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Icon extends js.Object {
  /**
    * Parses the input to an icon-id.
    *
    * @param id
    * The id of the icon to get.
    *
    * @param params
    * Additional parameters for getting the icon.
    *
    * @return
    * The id of the icon to get.
    */
  var iconIdParser: js.UndefOr[js.Function2[/* id */ String, /* params */ js.Array[String], String]] = js.native
}

object Icon {
  @scala.inline
  def apply(): Icon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Icon]
  }
  @scala.inline
  implicit class IconOps[Self <: Icon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIconIdParser(value: (/* id */ String, /* params */ js.Array[String]) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconIdParser")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutIconIdParser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconIdParser")(js.undefined)
        ret
    }
  }
  
}

