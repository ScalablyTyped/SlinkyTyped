package typingsSlinky.tablesorter.tablesorterMod._Global_

import typingsSlinky.tablesorter.systemTablesorterConfigurationStoreMod.TablesorterConfigurationStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLElement extends js.Object {
  /**
    * The configuration of the tablesorter.
    */
  var config: TablesorterConfigurationStore[this.type]
  /**
    * A value indicating whether the tablesorter has initialized.
    */
  var hasInitialized: Boolean
}

object HTMLElement {
  @scala.inline
  def apply(config: TablesorterConfigurationStore[HTMLElement], hasInitialized: Boolean): HTMLElement = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], hasInitialized = hasInitialized.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HTMLElement]
  }
}

