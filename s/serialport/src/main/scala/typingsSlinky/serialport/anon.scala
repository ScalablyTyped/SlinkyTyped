package typingsSlinky.serialport

import typingsSlinky.node.Buffer
import typingsSlinky.serialport.serialportStrings.ascii
import typingsSlinky.serialport.serialportStrings.base64
import typingsSlinky.serialport.serialportStrings.binary
import typingsSlinky.serialport.serialportStrings.hex
import typingsSlinky.serialport.serialportStrings.ucs2
import typingsSlinky.serialport.serialportStrings.utf16le
import typingsSlinky.serialport.serialportStrings.utf8
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait `0` extends StObject {
    
    var delimiter: String | Buffer | js.Array[Double] = js.native
  }
  object `0` {
    
    @scala.inline
    def apply(delimiter: String | Buffer | js.Array[Double]): `0` = {
      val __obj = js.Dynamic.literal(delimiter = delimiter.asInstanceOf[js.Any])
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelimiter(value: String | Buffer | js.Array[Double]): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimiterVarargs(value: Double*): Self = StObject.set(x, "delimiter", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Cts extends StObject {
    
    var cts: Boolean = js.native
    
    var dcd: Boolean = js.native
    
    var dsr: Boolean = js.native
  }
  object Cts {
    
    @scala.inline
    def apply(cts: Boolean, dcd: Boolean, dsr: Boolean): Cts = {
      val __obj = js.Dynamic.literal(cts = cts.asInstanceOf[js.Any], dcd = dcd.asInstanceOf[js.Any], dsr = dsr.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cts]
    }
    
    @scala.inline
    implicit class CtsMutableBuilder[Self <: Cts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCts(value: Boolean): Self = StObject.set(x, "cts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDcd(value: Boolean): Self = StObject.set(x, "dcd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDsr(value: Boolean): Self = StObject.set(x, "dsr", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Delimiter extends StObject {
    
    var delimiter: String | Buffer | js.Array[Double] = js.native
    
    var includeDelimiter: js.UndefOr[Boolean] = js.native
  }
  object Delimiter {
    
    @scala.inline
    def apply(delimiter: String | Buffer | js.Array[Double]): Delimiter = {
      val __obj = js.Dynamic.literal(delimiter = delimiter.asInstanceOf[js.Any])
      __obj.asInstanceOf[Delimiter]
    }
    
    @scala.inline
    implicit class DelimiterMutableBuilder[Self <: Delimiter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelimiter(value: String | Buffer | js.Array[Double]): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimiterVarargs(value: Double*): Self = StObject.set(x, "delimiter", js.Array(value :_*))
      
      @scala.inline
      def setIncludeDelimiter(value: Boolean): Self = StObject.set(x, "includeDelimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeDelimiterUndefined: Self = StObject.set(x, "includeDelimiter", js.undefined)
    }
  }
  
  @js.native
  trait Encoding extends StObject {
    
    var delimiter: String | Buffer | js.Array[Double] = js.native
    
    var encoding: js.UndefOr[ascii | utf8 | utf16le | ucs2 | base64 | binary | hex] = js.native
    
    var includeDelimiter: js.UndefOr[Boolean] = js.native
  }
  object Encoding {
    
    @scala.inline
    def apply(delimiter: String | Buffer | js.Array[Double]): Encoding = {
      val __obj = js.Dynamic.literal(delimiter = delimiter.asInstanceOf[js.Any])
      __obj.asInstanceOf[Encoding]
    }
    
    @scala.inline
    implicit class EncodingMutableBuilder[Self <: Encoding] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelimiter(value: String | Buffer | js.Array[Double]): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimiterVarargs(value: Double*): Self = StObject.set(x, "delimiter", js.Array(value :_*))
      
      @scala.inline
      def setEncoding(value: ascii | utf8 | utf16le | ucs2 | base64 | binary | hex): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setIncludeDelimiter(value: Boolean): Self = StObject.set(x, "includeDelimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeDelimiterUndefined: Self = StObject.set(x, "includeDelimiter", js.undefined)
    }
  }
  
  @js.native
  trait Length extends StObject {
    
    var length: Double = js.native
  }
  object Length {
    
    @scala.inline
    def apply(length: Double): Length = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[Length]
    }
    
    @scala.inline
    implicit class LengthMutableBuilder[Self <: Length] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Regex extends StObject {
    
    var regex: js.RegExp = js.native
  }
  object Regex {
    
    @scala.inline
    def apply(regex: js.RegExp): Regex = {
      val __obj = js.Dynamic.literal(regex = regex.asInstanceOf[js.Any])
      __obj.asInstanceOf[Regex]
    }
    
    @scala.inline
    implicit class RegexMutableBuilder[Self <: Regex] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRegex(value: js.RegExp): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Vmin extends StObject {
    
    var vmin: js.UndefOr[Double] = js.native
    
    var vtime: js.UndefOr[Double] = js.native
  }
  object Vmin {
    
    @scala.inline
    def apply(): Vmin = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Vmin]
    }
    
    @scala.inline
    implicit class VminMutableBuilder[Self <: Vmin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setVmin(value: Double): Self = StObject.set(x, "vmin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVminUndefined: Self = StObject.set(x, "vmin", js.undefined)
      
      @scala.inline
      def setVtime(value: Double): Self = StObject.set(x, "vtime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVtimeUndefined: Self = StObject.set(x, "vtime", js.undefined)
    }
  }
}
