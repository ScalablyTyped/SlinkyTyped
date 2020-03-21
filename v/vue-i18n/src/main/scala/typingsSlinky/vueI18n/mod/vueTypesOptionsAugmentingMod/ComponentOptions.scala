package typingsSlinky.vueI18n.mod.vueTypesOptionsAugmentingMod

import typingsSlinky.vue.vueMod.Vue
import typingsSlinky.vueI18n.AnonDateTimeFormats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentOptions[V /* <: Vue */] extends js.Object {
  var i18n: js.UndefOr[AnonDateTimeFormats] = js.undefined
}

object ComponentOptions {
  @scala.inline
  def apply[V /* <: Vue */](i18n: AnonDateTimeFormats = null): ComponentOptions[V] = {
    val __obj = js.Dynamic.literal()
    if (i18n != null) __obj.updateDynamic("i18n")(i18n.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentOptions[V]]
  }
}

