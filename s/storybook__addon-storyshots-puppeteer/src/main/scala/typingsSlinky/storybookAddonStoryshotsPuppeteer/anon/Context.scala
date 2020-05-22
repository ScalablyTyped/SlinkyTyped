package typingsSlinky.storybookAddonStoryshotsPuppeteer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var context: typingsSlinky.storybookAddonStoryshotsPuppeteer.configMod.Context
  var image: String
}

object Context {
  @scala.inline
  def apply(context: typingsSlinky.storybookAddonStoryshotsPuppeteer.configMod.Context, image: String): Context = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
}

