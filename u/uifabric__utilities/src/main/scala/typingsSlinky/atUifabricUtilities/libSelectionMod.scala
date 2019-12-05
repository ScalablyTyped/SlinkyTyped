package typingsSlinky.atUifabricUtilities

import typingsSlinky.atUifabricUtilities.atUifabricUtilitiesStrings.change
import typingsSlinky.atUifabricUtilities.libSelectionSelectionMod.ISelectionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/utilities/lib/selection", JSImport.Namespace)
@js.native
object libSelectionMod extends js.Object {
  @js.native
  class Selection ()
    extends typingsSlinky.atUifabricUtilities.libSelectionSelectionMod.Selection {
    def this(options: ISelectionOptions) = this()
  }
  
  val SELECTION_CHANGE: change = js.native
  @js.native
  object SelectionDirection extends js.Object {
    /* 0 */ val horizontal: typingsSlinky.atUifabricUtilities.libSelectionSelectionDotTypesMod.SelectionDirection.horizontal with Double = js.native
    /* 1 */ val vertical: typingsSlinky.atUifabricUtilities.libSelectionSelectionDotTypesMod.SelectionDirection.vertical with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.atUifabricUtilities.libSelectionSelectionDotTypesMod.SelectionDirection with Double
      ] = js.native
  }
  
  @js.native
  object SelectionMode extends js.Object {
    /* 2 */ val multiple: typingsSlinky.atUifabricUtilities.libSelectionSelectionDotTypesMod.SelectionMode.multiple with Double = js.native
    /* 0 */ val none: typingsSlinky.atUifabricUtilities.libSelectionSelectionDotTypesMod.SelectionMode.none with Double = js.native
    /* 1 */ val single: typingsSlinky.atUifabricUtilities.libSelectionSelectionDotTypesMod.SelectionMode.single with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.atUifabricUtilities.libSelectionSelectionDotTypesMod.SelectionMode with Double
      ] = js.native
  }
  
}

