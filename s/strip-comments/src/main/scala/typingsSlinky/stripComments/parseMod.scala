package typingsSlinky.stripComments

import typingsSlinky.stripComments.mod.Options
import typingsSlinky.stripComments.nodeMod.Block
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseMod {
  
  /**
    * Parses a string and returns a basic CST (Concrete Syntax Tree).
    *
    * ```js
    * const strip = require('..');
    * const str = strip.block('const foo = "bar";// this is a comment\n / * me too *\/');
    * console.log(str);
    * // => 'const foo = "bar";// this is a comment'
    * ```
    * @param  `input` string from which to strip comments
    * @param  `options` pass `opts.keepProtected: true` to keep ignored comments (e.g. `/ *!`)
    */
  @JSImport("strip-comments/lib/parse", JSImport.Namespace)
  @js.native
  def apply(input: String): Block = js.native
  @JSImport("strip-comments/lib/parse", JSImport.Namespace)
  @js.native
  def apply(input: String, options: Options): Block = js.native
}
