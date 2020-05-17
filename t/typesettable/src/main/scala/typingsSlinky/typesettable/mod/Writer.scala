package typingsSlinky.typesettable.mod

import typingsSlinky.typesettable.anon.KinIXAlignnumber
import typingsSlinky.typesettable.anon.KinIYAlignnumber
import typingsSlinky.typesettable.contextsMod.IPenFactoryContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesettable", "Writer")
@js.native
class Writer protected ()
  extends typingsSlinky.typesettable.writersMod.Writer {
  def this(
    _measurer: typingsSlinky.typesettable.measurersMod.AbstractMeasurer,
    _penFactory: IPenFactoryContext[_]
  ) = this()
  def this(
    _measurer: typingsSlinky.typesettable.measurersMod.AbstractMeasurer,
    _penFactory: IPenFactoryContext[_],
    _wrapper: typingsSlinky.typesettable.wrappersMod.Wrapper
  ) = this()
}

/* static members */
@JSImport("typesettable", "Writer")
@js.native
object Writer extends js.Object {
  var SupportedRotation: js.Any = js.native
  var XOffsetFactor: KinIXAlignnumber = js.native
  var YOffsetFactor: KinIYAlignnumber = js.native
}

