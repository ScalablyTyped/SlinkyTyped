package typingsSlinky.uifabricMergeStyles

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.std.Extract
import typingsSlinky.std.Partial
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/merge-styles/lib/IStyleSet", JSImport.Namespace)
@js.native
object istylesetMod extends js.Object {
  @js.native
  trait IConcatenatedStyleSet[TStyleSet /* <: IStyleSet[TStyleSet] */] extends js.Object {
    var subComponentStyles: js.UndefOr[
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof TStyleSet['subComponentStyles'] ]: @uifabric/merge-styles.@uifabric/merge-styles/lib/IStyleFunction.IStyleFunction<any, @uifabric/merge-styles.@uifabric/merge-styles/lib/IStyleSet.IStyleSet<any>>}
      */ typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.IConcatenatedStyleSet with TopLevel[js.Any]
      ] = js.native
  }
  
  @js.native
  trait IProcessedStyleSet[TStyleSet /* <: IStyleSet[TStyleSet] */] extends js.Object {
    var subComponentStyles: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof TStyleSet['subComponentStyles'] ]: @uifabric/merge-styles.@uifabric/merge-styles/lib/IStyleSet.__MapToFunctionType<TStyleSet['subComponentStyles'] extends infer J? P extends keyof any? any[P] : never : never>}
      */ typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.IProcessedStyleSet with TopLevel[js.Any] = js.native
  }
  
  @js.native
  trait IStyleSet[TStyleSet /* <: IStyleSet[TStyleSet] */] extends js.Object {
    var subComponentStyles: js.UndefOr[
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof TStyleSet['subComponentStyles'] ]: @uifabric/merge-styles.@uifabric/merge-styles/lib/IStyleFunction.IStyleFunctionOrObject<any, @uifabric/merge-styles.@uifabric/merge-styles/lib/IStyleSet.IStyleSet<any>>}
      */ typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.IStyleSet with TopLevel[js.Any]
      ] = js.native
  }
  
  type Diff[T /* <: /* keyof any */ String */, U /* <: /* keyof any */ String */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in T ]: P} & {[ P in U ]: never} & {[x: string] : never}[T] */ js.Any
  type MapToFunctionType[T] = (Extract[T, js.Function]) | (js.Function1[/* repeated */ js.Any, Partial[T]])
  type Omit[U, K /* <: /* keyof U */ String */] = Pick[U, Diff[/* keyof U */ String, K]]
}

