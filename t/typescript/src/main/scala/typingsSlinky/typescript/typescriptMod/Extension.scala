package typingsSlinky.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Extension extends js.Object

@JSImport("typescript", "Extension")
@js.native
object Extension extends js.Object {
  @js.native
  sealed trait Dts extends Extension
  
  @js.native
  sealed trait Js extends Extension
  
  @js.native
  sealed trait Json extends Extension
  
  @js.native
  sealed trait Jsx extends Extension
  
  @js.native
  sealed trait Ts extends Extension
  
  @js.native
  sealed trait TsBuildInfo extends Extension
  
  @js.native
  sealed trait Tsx extends Extension
  
  /* ".d.ts" */ val Dts: typingsSlinky.typescript.typescriptMod.Extension.Dts with String = js.native
  /* ".js" */ val Js: typingsSlinky.typescript.typescriptMod.Extension.Js with String = js.native
  /* ".json" */ val Json: typingsSlinky.typescript.typescriptMod.Extension.Json with String = js.native
  /* ".jsx" */ val Jsx: typingsSlinky.typescript.typescriptMod.Extension.Jsx with String = js.native
  /* ".ts" */ val Ts: typingsSlinky.typescript.typescriptMod.Extension.Ts with String = js.native
  /* ".tsbuildinfo" */ val TsBuildInfo: typingsSlinky.typescript.typescriptMod.Extension.TsBuildInfo with String = js.native
  /* ".tsx" */ val Tsx: typingsSlinky.typescript.typescriptMod.Extension.Tsx with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Extension with String] = js.native
}

