package typingsSlinky.uirouterCore.commonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Trace categories Enum
  *
  * Enable or disable a category using [[Trace.enable]] or [[Trace.disable]]
  *
  * `trace.enable(Category.TRANSITION)`
  *
  * These can also be provided using a matching string, or position ordinal
  *
  * `trace.enable("TRANSITION")`
  *
  * `trace.enable(1)`
  */
@JSImport("@uirouter/core/lib/common", "Category")
@js.native
object Category extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typingsSlinky.uirouterCore.traceMod.Category with Double] = js.native
  
  /* 2 */ val HOOK: typingsSlinky.uirouterCore.traceMod.Category.HOOK with Double = js.native
  
  /* 0 */ val RESOLVE: typingsSlinky.uirouterCore.traceMod.Category.RESOLVE with Double = js.native
  
  /* 1 */ val TRANSITION: typingsSlinky.uirouterCore.traceMod.Category.TRANSITION with Double = js.native
  
  /* 3 */ val UIVIEW: typingsSlinky.uirouterCore.traceMod.Category.UIVIEW with Double = js.native
  
  /* 4 */ val VIEWCONFIG: typingsSlinky.uirouterCore.traceMod.Category.VIEWCONFIG with Double = js.native
}
