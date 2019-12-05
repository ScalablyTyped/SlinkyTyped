package typingsSlinky.tsutils.utilUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ImportKind extends js.Object

@JSImport("tsutils/util/util", "ImportKind")
@js.native
object ImportKind extends js.Object {
  @js.native
  sealed trait All extends ImportKind
  
  @js.native
  sealed trait AllImportExpressions extends ImportKind
  
  @js.native
  sealed trait AllImports extends ImportKind
  
  @js.native
  sealed trait AllRequireLike extends ImportKind
  
  @js.native
  sealed trait AllStaticImports extends ImportKind
  
  @js.native
  sealed trait DynamicImport extends ImportKind
  
  @js.native
  sealed trait ExportFrom extends ImportKind
  
  @js.native
  sealed trait ImportDeclaration extends ImportKind
  
  @js.native
  sealed trait ImportEquals extends ImportKind
  
  @js.native
  sealed trait ImportType extends ImportKind
  
  @js.native
  sealed trait Require extends ImportKind
  
  /* 63 */ val All: typingsSlinky.tsutils.utilUtilMod.ImportKind.All with Double = js.native
  /* 24 */ val AllImportExpressions: typingsSlinky.tsutils.utilUtilMod.ImportKind.AllImportExpressions with Double = js.native
  /* 59 */ val AllImports: typingsSlinky.tsutils.utilUtilMod.ImportKind.AllImports with Double = js.native
  /* 18 */ val AllRequireLike: typingsSlinky.tsutils.utilUtilMod.ImportKind.AllRequireLike with Double = js.native
  /* 3 */ val AllStaticImports: typingsSlinky.tsutils.utilUtilMod.ImportKind.AllStaticImports with Double = js.native
  /* 8 */ val DynamicImport: typingsSlinky.tsutils.utilUtilMod.ImportKind.DynamicImport with Double = js.native
  /* 4 */ val ExportFrom: typingsSlinky.tsutils.utilUtilMod.ImportKind.ExportFrom with Double = js.native
  /* 1 */ val ImportDeclaration: typingsSlinky.tsutils.utilUtilMod.ImportKind.ImportDeclaration with Double = js.native
  /* 2 */ val ImportEquals: typingsSlinky.tsutils.utilUtilMod.ImportKind.ImportEquals with Double = js.native
  /* 32 */ val ImportType: typingsSlinky.tsutils.utilUtilMod.ImportKind.ImportType with Double = js.native
  /* 16 */ val Require: typingsSlinky.tsutils.utilUtilMod.ImportKind.Require with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ImportKind with Double] = js.native
}

