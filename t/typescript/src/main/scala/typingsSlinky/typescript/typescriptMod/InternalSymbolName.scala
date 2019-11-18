package typingsSlinky.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait InternalSymbolName extends js.Object

@JSImport("typescript", "InternalSymbolName")
@js.native
object InternalSymbolName extends js.Object {
  @js.native
  sealed trait Call extends InternalSymbolName
  
  @js.native
  sealed trait Class extends InternalSymbolName
  
  @js.native
  sealed trait Computed extends InternalSymbolName
  
  @js.native
  sealed trait Constructor extends InternalSymbolName
  
  @js.native
  sealed trait Default extends InternalSymbolName
  
  @js.native
  sealed trait ExportEquals extends InternalSymbolName
  
  @js.native
  sealed trait ExportStar extends InternalSymbolName
  
  @js.native
  sealed trait Function extends InternalSymbolName
  
  @js.native
  sealed trait Global extends InternalSymbolName
  
  @js.native
  sealed trait Index extends InternalSymbolName
  
  @js.native
  sealed trait JSXAttributes extends InternalSymbolName
  
  @js.native
  sealed trait Missing extends InternalSymbolName
  
  @js.native
  sealed trait New extends InternalSymbolName
  
  @js.native
  sealed trait Object extends InternalSymbolName
  
  @js.native
  sealed trait Resolving extends InternalSymbolName
  
  @js.native
  sealed trait This extends InternalSymbolName
  
  @js.native
  sealed trait Type extends InternalSymbolName
  
  /* "__call" */ val Call: typingsSlinky.typescript.typescriptMod.InternalSymbolName.Call with String = js.native
  /* "__class" */ val Class: typingsSlinky.typescript.typescriptMod.InternalSymbolName.Class with String = js.native
  /* "__computed" */ val Computed: typingsSlinky.typescript.typescriptMod.InternalSymbolName.Computed with String = js.native
  /* "__constructor" */ val Constructor: typingsSlinky.typescript.typescriptMod.InternalSymbolName.Constructor with String = js.native
  /* "default" */ val Default: typingsSlinky.typescript.typescriptMod.InternalSymbolName.Default with String = js.native
  /* "export=" */ val ExportEquals: typingsSlinky.typescript.typescriptMod.InternalSymbolName.ExportEquals with String = js.native
  /* "__export" */ val ExportStar: typingsSlinky.typescript.typescriptMod.InternalSymbolName.ExportStar with String = js.native
  /* "__function" */ val Function: typingsSlinky.typescript.typescriptMod.InternalSymbolName.Function with String = js.native
  /* "__global" */ val Global: typingsSlinky.typescript.typescriptMod.InternalSymbolName.Global with String = js.native
  /* "__index" */ val Index: typingsSlinky.typescript.typescriptMod.InternalSymbolName.Index with String = js.native
  /* "__jsxAttributes" */ val JSXAttributes: typingsSlinky.typescript.typescriptMod.InternalSymbolName.JSXAttributes with String = js.native
  /* "__missing" */ val Missing: typingsSlinky.typescript.typescriptMod.InternalSymbolName.Missing with String = js.native
  /* "__new" */ val New: typingsSlinky.typescript.typescriptMod.InternalSymbolName.New with String = js.native
  /* "__object" */ val Object: typingsSlinky.typescript.typescriptMod.InternalSymbolName.Object with String = js.native
  /* "__resolving__" */ val Resolving: typingsSlinky.typescript.typescriptMod.InternalSymbolName.Resolving with String = js.native
  /* "this" */ val This: typingsSlinky.typescript.typescriptMod.InternalSymbolName.This with String = js.native
  /* "__type" */ val Type: typingsSlinky.typescript.typescriptMod.InternalSymbolName.Type with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[InternalSymbolName with String] = js.native
}

