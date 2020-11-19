package typingsSlinky.typescript.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ModuleKind extends js.Object
@JSImport("typescript", "ModuleKind")
@js.native
object ModuleKind extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ModuleKind with Double] = js.native
  
  @js.native
  sealed trait AMD extends ModuleKind
  /* 2 */ @js.native
  object AMD extends TopLevel[AMD with Double]
  
  @js.native
  sealed trait CommonJS extends ModuleKind
  /* 1 */ @js.native
  object CommonJS extends TopLevel[CommonJS with Double]
  
  @js.native
  sealed trait ES2015 extends ModuleKind
  /* 5 */ @js.native
  object ES2015 extends TopLevel[ES2015 with Double]
  
  @js.native
  sealed trait ES2020 extends ModuleKind
  /* 6 */ @js.native
  object ES2020 extends TopLevel[ES2020 with Double]
  
  @js.native
  sealed trait ESNext extends ModuleKind
  /* 99 */ @js.native
  object ESNext extends TopLevel[ESNext with Double]
  
  @js.native
  sealed trait None extends ModuleKind
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  @js.native
  sealed trait System extends ModuleKind
  /* 4 */ @js.native
  object System
    extends TopLevel[typingsSlinky.typescript.mod.ModuleKind.System with Double]
  
  @js.native
  sealed trait UMD extends ModuleKind
  /* 3 */ @js.native
  object UMD extends TopLevel[UMD with Double]
}
