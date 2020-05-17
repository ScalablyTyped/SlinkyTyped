package typingsSlinky.uifabricMergeStyles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object istylesetMod {
  type Diff[T /* <: /* keyof any */ java.lang.String */, U /* <: /* keyof any */ java.lang.String */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in T ]: P} & {[ P in U ]: never} & {[x: string] : never}[T] */ js.Any
  type Omit[U, K /* <: /* keyof U */ java.lang.String */] = typingsSlinky.std.Pick[
    U, 
    typingsSlinky.uifabricMergeStyles.istylesetMod.Diff[/* keyof U */ java.lang.String, K]
  ]
}
