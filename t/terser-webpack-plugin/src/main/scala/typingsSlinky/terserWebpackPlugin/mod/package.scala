package typingsSlinky.terserWebpackPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ExtractCommentFn = js.Function2[/* astNode */ js.Any, /* comment */ js.Any, scala.Boolean | js.Object]
  
  type FilenameFn = js.Function1[/* fileData */ typingsSlinky.terserWebpackPlugin.mod.FileData, java.lang.String]
  
  type FormatFn = js.Function1[/* input */ java.lang.String, java.lang.String]
  
  type TerserPlugin = typingsSlinky.std.Plugin
}
