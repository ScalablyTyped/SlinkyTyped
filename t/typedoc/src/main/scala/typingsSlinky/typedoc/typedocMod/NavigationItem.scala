package typingsSlinky.typedoc.typedocMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "NavigationItem")
@js.native
class NavigationItem ()
  extends typingsSlinky.typedoc.distLibOutputModelsNavigationItemMod.NavigationItem {
  def this(title: String) = this()
  def this(title: String, url: String) = this()
  def this(
    title: String,
    url: String,
    parent: typingsSlinky.typedoc.distLibOutputModelsNavigationItemMod.NavigationItem
  ) = this()
  def this(
    title: String,
    url: String,
    parent: typingsSlinky.typedoc.distLibOutputModelsNavigationItemMod.NavigationItem,
    cssClasses: String
  ) = this()
  def this(
    title: String,
    url: String,
    parent: typingsSlinky.typedoc.distLibOutputModelsNavigationItemMod.NavigationItem,
    cssClasses: String,
    reflection: typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.Reflection
  ) = this()
}

/* static members */
@JSImport("typedoc", "NavigationItem")
@js.native
object NavigationItem extends js.Object {
  def create(reflection: typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.Reflection): typingsSlinky.typedoc.distLibOutputModelsNavigationItemMod.NavigationItem = js.native
  def create(
    reflection: typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.Reflection,
    parent: typingsSlinky.typedoc.distLibOutputModelsNavigationItemMod.NavigationItem
  ): typingsSlinky.typedoc.distLibOutputModelsNavigationItemMod.NavigationItem = js.native
  def create(
    reflection: typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.Reflection,
    parent: typingsSlinky.typedoc.distLibOutputModelsNavigationItemMod.NavigationItem,
    useShortNames: Boolean
  ): typingsSlinky.typedoc.distLibOutputModelsNavigationItemMod.NavigationItem = js.native
}

