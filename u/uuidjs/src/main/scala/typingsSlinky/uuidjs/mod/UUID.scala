package typingsSlinky.uuidjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @deprecated Use class-based API */
@js.native
trait UUID extends js.Object {
  var bitFields: UUIDFields[String] = js.native
  var bitString: String = js.native
  var hexFields: UUIDFields[String] = js.native
  var hexNoDelim: String = js.native
  var hexString: String = js.native
  var intFields: UUIDFields[Double] = js.native
  var urn: String = js.native
  var version: Double = js.native
  def equals(uuid: UUID): Boolean = js.native
}

object UUID {
  @scala.inline
  def apply(
    bitFields: UUIDFields[String],
    bitString: String,
    equals: UUID => Boolean,
    hexFields: UUIDFields[String],
    hexNoDelim: String,
    hexString: String,
    intFields: UUIDFields[Double],
    urn: String,
    version: Double
  ): UUID = {
    val __obj = js.Dynamic.literal(bitFields = bitFields.asInstanceOf[js.Any], bitString = bitString.asInstanceOf[js.Any], equals = js.Any.fromFunction1(equals), hexFields = hexFields.asInstanceOf[js.Any], hexNoDelim = hexNoDelim.asInstanceOf[js.Any], hexString = hexString.asInstanceOf[js.Any], intFields = intFields.asInstanceOf[js.Any], urn = urn.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[UUID]
  }
  @scala.inline
  implicit class UUIDOps[Self <: UUID] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBitFields(value: UUIDFields[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBitString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEquals(value: UUID => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equals")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHexFields(value: UUIDFields[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hexFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHexNoDelim(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hexNoDelim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHexString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hexString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIntFields(value: UUIDFields[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

