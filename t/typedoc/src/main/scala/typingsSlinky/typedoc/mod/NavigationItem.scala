package typingsSlinky.typedoc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "NavigationItem")
@js.native
class NavigationItem ()
  extends typingsSlinky.typedoc.navigationItemMod.NavigationItem {
  def this(title: String) = this()
  def this(title: String, url: String) = this()
  def this(title: String, url: String, parent: typingsSlinky.typedoc.navigationItemMod.NavigationItem) = this()
  def this(
    title: String,
    url: String,
    parent: typingsSlinky.typedoc.navigationItemMod.NavigationItem,
    cssClasses: String
  ) = this()
  def this(
    title: String,
    url: String,
    parent: typingsSlinky.typedoc.navigationItemMod.NavigationItem,
    cssClasses: String,
    reflection: typingsSlinky.typedoc.abstractMod.Reflection
  ) = this()
}

/* static members */
@JSImport("typedoc", "NavigationItem")
@js.native
object NavigationItem extends js.Object {
  def create(reflection: typingsSlinky.typedoc.abstractMod.Reflection): typingsSlinky.typedoc.navigationItemMod.NavigationItem = js.native
  def create(
    reflection: typingsSlinky.typedoc.abstractMod.Reflection,
    parent: typingsSlinky.typedoc.navigationItemMod.NavigationItem
  ): typingsSlinky.typedoc.navigationItemMod.NavigationItem = js.native
  def create(
    reflection: typingsSlinky.typedoc.abstractMod.Reflection,
    parent: typingsSlinky.typedoc.navigationItemMod.NavigationItem,
    useShortNames: Boolean
  ): typingsSlinky.typedoc.navigationItemMod.NavigationItem = js.native
}

