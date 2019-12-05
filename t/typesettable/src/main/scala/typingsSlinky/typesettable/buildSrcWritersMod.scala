package typingsSlinky.typesettable

import typingsSlinky.typesettable.buildSrcContextsMod.IPenFactoryContext
import typingsSlinky.typesettable.buildSrcMeasurersMod.AbstractMeasurer
import typingsSlinky.typesettable.buildSrcWrappersMod.Wrapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesettable/build/src/writers", JSImport.Namespace)
@js.native
object buildSrcWritersMod extends js.Object {
  @js.native
  class Writer protected ()
    extends typingsSlinky.typesettable.buildSrcWritersWriterMod.Writer {
    def this(_measurer: AbstractMeasurer, _penFactory: IPenFactoryContext[_]) = this()
    def this(_measurer: AbstractMeasurer, _penFactory: IPenFactoryContext[_], _wrapper: Wrapper) = this()
  }
  
  /* static members */
  @js.native
  object Writer extends js.Object {
    var SupportedRotation: js.Any = js.native
    var XOffsetFactor: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in typesettable.typesettable/build/src/writers/writer.IXAlign ]: number}
      */ typingsSlinky.typesettable.typesettableStrings.Writer with js.Any = js.native
    var YOffsetFactor: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in typesettable.typesettable/build/src/writers/writer.IYAlign ]: number}
      */ typingsSlinky.typesettable.typesettableStrings.Writer with js.Any = js.native
  }
  
}

