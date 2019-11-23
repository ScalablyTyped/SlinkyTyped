package typingsSlinky.atStorybookAddons.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait types extends js.Object

@JSImport("@storybook/addons/dist/types", "types")
@js.native
object types extends js.Object {
  @js.native
  sealed trait NOTES_ELEMENT extends types
  
  @js.native
  sealed trait PANEL extends types
  
  @js.native
  sealed trait PREVIEW extends types
  
  @js.native
  sealed trait TAB extends types
  
  @js.native
  sealed trait TOOL extends types
  
  /* "notes-element" */ val NOTES_ELEMENT: typingsSlinky.atStorybookAddons.distTypesMod.types.NOTES_ELEMENT with String = js.native
  /* "panel" */ val PANEL: typingsSlinky.atStorybookAddons.distTypesMod.types.PANEL with String = js.native
  /* "preview" */ val PREVIEW: typingsSlinky.atStorybookAddons.distTypesMod.types.PREVIEW with String = js.native
  /* "tab" */ val TAB: typingsSlinky.atStorybookAddons.distTypesMod.types.TAB with String = js.native
  /* "tool" */ val TOOL: typingsSlinky.atStorybookAddons.distTypesMod.types.TOOL with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[types with String] = js.native
}

