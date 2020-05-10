package typingsSlinky.tedious.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TediousTypes extends js.Object {
  var BigInt: TediousType = js.native
  var Binary: TediousType = js.native
  var Bit: TediousType = js.native
  var Char: TediousType = js.native
  var Date: TediousType = js.native
  var DateTime: TediousType = js.native
  var DateTime2: TediousType = js.native
  var DateTimeOffset: TediousType = js.native
  var Decimal: TediousType = js.native
  var Float: TediousType = js.native
  var Image: TediousType = js.native
  var Int: TediousType = js.native
  var Money: TediousType = js.native
  var NChar: TediousType = js.native
  var NText: TediousType = js.native
  var NVarChar: TediousType = js.native
  var Null: TediousType = js.native
  var Numeric: TediousType = js.native
  var Real: TediousType = js.native
  var SmallDateTime: TediousType = js.native
  var SmallInt: TediousType = js.native
  var SmallMoney: TediousType = js.native
  var TVP: TediousType = js.native
  var Text: TediousType = js.native
  var Time: TediousType = js.native
  var TinyInt: TediousType = js.native
  var UDT: TediousType = js.native
  var UniqueIdentifier: TediousType = js.native
  var VarBinary: TediousType = js.native
  var VarChar: TediousType = js.native
  var Xml: TediousType = js.native
}

object TediousTypes {
  @scala.inline
  def apply(
    BigInt: TediousType,
    Binary: TediousType,
    Bit: TediousType,
    Char: TediousType,
    Date: TediousType,
    DateTime: TediousType,
    DateTime2: TediousType,
    DateTimeOffset: TediousType,
    Decimal: TediousType,
    Float: TediousType,
    Image: TediousType,
    Int: TediousType,
    Money: TediousType,
    NChar: TediousType,
    NText: TediousType,
    NVarChar: TediousType,
    Null: TediousType,
    Numeric: TediousType,
    Real: TediousType,
    SmallDateTime: TediousType,
    SmallInt: TediousType,
    SmallMoney: TediousType,
    TVP: TediousType,
    Text: TediousType,
    Time: TediousType,
    TinyInt: TediousType,
    UDT: TediousType,
    UniqueIdentifier: TediousType,
    VarBinary: TediousType,
    VarChar: TediousType,
    Xml: TediousType
  ): TediousTypes = {
    val __obj = js.Dynamic.literal(BigInt = BigInt.asInstanceOf[js.Any], Binary = Binary.asInstanceOf[js.Any], Bit = Bit.asInstanceOf[js.Any], Char = Char.asInstanceOf[js.Any], Date = Date.asInstanceOf[js.Any], DateTime = DateTime.asInstanceOf[js.Any], DateTime2 = DateTime2.asInstanceOf[js.Any], DateTimeOffset = DateTimeOffset.asInstanceOf[js.Any], Decimal = Decimal.asInstanceOf[js.Any], Float = Float.asInstanceOf[js.Any], Image = Image.asInstanceOf[js.Any], Int = Int.asInstanceOf[js.Any], Money = Money.asInstanceOf[js.Any], NChar = NChar.asInstanceOf[js.Any], NText = NText.asInstanceOf[js.Any], NVarChar = NVarChar.asInstanceOf[js.Any], Null = Null.asInstanceOf[js.Any], Numeric = Numeric.asInstanceOf[js.Any], Real = Real.asInstanceOf[js.Any], SmallDateTime = SmallDateTime.asInstanceOf[js.Any], SmallInt = SmallInt.asInstanceOf[js.Any], SmallMoney = SmallMoney.asInstanceOf[js.Any], TVP = TVP.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], Time = Time.asInstanceOf[js.Any], TinyInt = TinyInt.asInstanceOf[js.Any], UDT = UDT.asInstanceOf[js.Any], UniqueIdentifier = UniqueIdentifier.asInstanceOf[js.Any], VarBinary = VarBinary.asInstanceOf[js.Any], VarChar = VarChar.asInstanceOf[js.Any], Xml = Xml.asInstanceOf[js.Any])
    __obj.asInstanceOf[TediousTypes]
  }
  @scala.inline
  implicit class TediousTypesOps[Self <: TediousTypes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBigInt(value: TediousType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BigInt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBinary(value: TediousType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Binary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBit(value: TediousType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChar(value: TediousType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Char")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDate(value: TediousType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDateTime(value: TediousType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDateTime2(value: TediousType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DateTime2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDateTimeOffset(value: TediousType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DateTimeOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDecimal(value: TediousType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Decimal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFloat(value: TediousType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Float")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImage(value: TediousType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInt(value: TediousType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Int")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMoney(value: TediousType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Money")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNChar(value: TediousType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NChar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNText(value: TediousType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNVarChar(value: TediousType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NVarChar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNull(value: TediousType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Null")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumeric(value: TediousType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Numeric")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReal(value: TediousType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Real")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSmallDateTime(value: TediousType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SmallDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSmallInt(value: TediousType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SmallInt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSmallMoney(value: TediousType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SmallMoney")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTVP(value: TediousType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TVP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: TediousType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTime(value: TediousType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTinyInt(value: TediousType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TinyInt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUDT(value: TediousType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UDT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUniqueIdentifier(value: TediousType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UniqueIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVarBinary(value: TediousType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VarBinary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVarChar(value: TediousType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VarChar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXml(value: TediousType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Xml")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

