package typingsSlinky.storybookAddonActions.actionDisplayMod

import typingsSlinky.storybookAddonActions.actionOptionsMod.ActionOptions
import typingsSlinky.storybookAddonActions.anon.Args
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionDisplay extends js.Object {
  var count: Double
  var data: Args
  var id: String
  var options: ActionOptions
}

object ActionDisplay {
  @scala.inline
  def apply(count: Double, data: Args, id: String, options: ActionOptions): ActionDisplay = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionDisplay]
  }
}

