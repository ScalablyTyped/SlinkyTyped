package typingsSlinky.xelib.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ElementType extends StObject
@JSImport("xelib", "ElementType")
@js.native
object ElementType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ElementType with Double] = js.native
  
  @js.native
  sealed trait etArray extends ElementType
  /* 7 */ val etArray: typingsSlinky.xelib.mod.ElementType.etArray with Double = js.native
  
  @js.native
  sealed trait etFile extends ElementType
  /* 0 */ val etFile: typingsSlinky.xelib.mod.ElementType.etFile with Double = js.native
  
  @js.native
  sealed trait etFlag extends ElementType
  /* 10 */ val etFlag: typingsSlinky.xelib.mod.ElementType.etFlag with Double = js.native
  
  @js.native
  sealed trait etGroupRecord extends ElementType
  /* 2 */ val etGroupRecord: typingsSlinky.xelib.mod.ElementType.etGroupRecord with Double = js.native
  
  @js.native
  sealed trait etMainRecord extends ElementType
  /* 1 */ val etMainRecord: typingsSlinky.xelib.mod.ElementType.etMainRecord with Double = js.native
  
  @js.native
  sealed trait etStringListTerminator extends ElementType
  /* 11 */ val etStringListTerminator: typingsSlinky.xelib.mod.ElementType.etStringListTerminator with Double = js.native
  
  @js.native
  sealed trait etStruct extends ElementType
  /* 8 */ val etStruct: typingsSlinky.xelib.mod.ElementType.etStruct with Double = js.native
  
  @js.native
  sealed trait etStructChapter extends ElementType
  /* 13 */ val etStructChapter: typingsSlinky.xelib.mod.ElementType.etStructChapter with Double = js.native
  
  @js.native
  sealed trait etSubRecord extends ElementType
  /* 3 */ val etSubRecord: typingsSlinky.xelib.mod.ElementType.etSubRecord with Double = js.native
  
  @js.native
  sealed trait etSubRecordArray extends ElementType
  /* 5 */ val etSubRecordArray: typingsSlinky.xelib.mod.ElementType.etSubRecordArray with Double = js.native
  
  @js.native
  sealed trait etSubRecordStruct extends ElementType
  /* 4 */ val etSubRecordStruct: typingsSlinky.xelib.mod.ElementType.etSubRecordStruct with Double = js.native
  
  @js.native
  sealed trait etSubRecordUnion extends ElementType
  /* 6 */ val etSubRecordUnion: typingsSlinky.xelib.mod.ElementType.etSubRecordUnion with Double = js.native
  
  @js.native
  sealed trait etUnion extends ElementType
  /* 12 */ val etUnion: typingsSlinky.xelib.mod.ElementType.etUnion with Double = js.native
  
  @js.native
  sealed trait etValue extends ElementType
  /* 9 */ val etValue: typingsSlinky.xelib.mod.ElementType.etValue with Double = js.native
}
