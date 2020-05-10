package typingsSlinky.uifabricStyling.ieffectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEffects extends js.Object {
  /**
    * Used to provide a visual affordance that this element is elevated above the surface it rests on.
    * This is lower than elevations with a higher value, and higher than elevations with a lower value.
    * Used for: search result dropdowns, hover cards, tooltips, help bubbles
    */
  var elevation16: String = js.native
  /**
    * Used to provide a visual affordance that this element is elevated above the surface it rests on.
    * This is lower than elevations with a higher value, and higher than elevations with a lower value.
    * Used for: cards, grid items
    */
  var elevation4: String = js.native
  /**
    * Used to provide a visual affordance that this element is elevated above the surface it rests on.
    * This is lower than elevations with a higher value, and higher than elevations with a lower value.
    * Used for: Panels, Dialogs
    */
  var elevation64: String = js.native
  /**
    * Used to provide a visual affordance that this element is elevated above the surface it rests on.
    * This is lower than elevations with a higher value, and higher than elevations with a lower value.
    * Used for: menus, command surfaces
    */
  var elevation8: String = js.native
  /**
    * How much corners should be rounded, for use with border-radius.
    */
  var roundedCorner2: String = js.native
}

object IEffects {
  @scala.inline
  def apply(
    elevation16: String,
    elevation4: String,
    elevation64: String,
    elevation8: String,
    roundedCorner2: String
  ): IEffects = {
    val __obj = js.Dynamic.literal(elevation16 = elevation16.asInstanceOf[js.Any], elevation4 = elevation4.asInstanceOf[js.Any], elevation64 = elevation64.asInstanceOf[js.Any], elevation8 = elevation8.asInstanceOf[js.Any], roundedCorner2 = roundedCorner2.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEffects]
  }
  @scala.inline
  implicit class IEffectsOps[Self <: IEffects] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElevation16(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elevation16")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElevation4(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elevation4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElevation64(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elevation64")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElevation8(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elevation8")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoundedCorner2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundedCorner2")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

