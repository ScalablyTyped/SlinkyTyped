package typingsSlinky.serialport

import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Duplex
import typingsSlinky.node.streamMod.Transform
import typingsSlinky.serialport.anon.Cts
import typingsSlinky.serialport.anon.Encoding
import typingsSlinky.serialport.anon.Length
import typingsSlinky.serialport.anon.Vmin
import typingsSlinky.serialport.anon.`0`
import typingsSlinky.serialport.serialportNumbers.`110`
import typingsSlinky.serialport.serialportNumbers.`115200`
import typingsSlinky.serialport.serialportNumbers.`1200`
import typingsSlinky.serialport.serialportNumbers.`134`
import typingsSlinky.serialport.serialportNumbers.`150`
import typingsSlinky.serialport.serialportNumbers.`1800`
import typingsSlinky.serialport.serialportNumbers.`19200`
import typingsSlinky.serialport.serialportNumbers.`1`
import typingsSlinky.serialport.serialportNumbers.`200`
import typingsSlinky.serialport.serialportNumbers.`2400`
import typingsSlinky.serialport.serialportNumbers.`2`
import typingsSlinky.serialport.serialportNumbers.`300`
import typingsSlinky.serialport.serialportNumbers.`38400`
import typingsSlinky.serialport.serialportNumbers.`4800`
import typingsSlinky.serialport.serialportNumbers.`50`
import typingsSlinky.serialport.serialportNumbers.`57600`
import typingsSlinky.serialport.serialportNumbers.`5`
import typingsSlinky.serialport.serialportNumbers.`600`
import typingsSlinky.serialport.serialportNumbers.`6`
import typingsSlinky.serialport.serialportNumbers.`75`
import typingsSlinky.serialport.serialportNumbers.`7`
import typingsSlinky.serialport.serialportNumbers.`8`
import typingsSlinky.serialport.serialportNumbers.`9600`
import typingsSlinky.serialport.serialportStrings.ascii
import typingsSlinky.serialport.serialportStrings.base64
import typingsSlinky.serialport.serialportStrings.binary
import typingsSlinky.serialport.serialportStrings.even
import typingsSlinky.serialport.serialportStrings.hex
import typingsSlinky.serialport.serialportStrings.mark
import typingsSlinky.serialport.serialportStrings.none
import typingsSlinky.serialport.serialportStrings.odd
import typingsSlinky.serialport.serialportStrings.space
import typingsSlinky.serialport.serialportStrings.ucs2
import typingsSlinky.serialport.serialportStrings.utf16le
import typingsSlinky.serialport.serialportStrings.utf8
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("serialport", JSImport.Namespace)
  @js.native
  class ^ protected () extends SerialPort {
    def this(path: String) = this()
    def this(path: String, callback: ErrorCallback) = this()
    def this(path: String, options: OpenOptions) = this()
    def this(path: String, options: js.UndefOr[scala.Nothing], callback: ErrorCallback) = this()
    def this(path: String, options: OpenOptions, callback: ErrorCallback) = this()
  }
  @JSImport("serialport", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // Binding Type Def
  @JSImport("serialport", "BaseBinding")
  @js.native
  class BaseBinding protected () extends StObject {
    def this(options: js.Any) = this()
    
    def close(): js.Promise[_] = js.native
    
    def drain(): js.Promise[_] = js.native
    
    def flush(): js.Promise[_] = js.native
    
    def get(): js.Promise[_] = js.native
    
    def open(path: String, options: OpenOptions): js.Promise[_] = js.native
    
    def read(data: Buffer, offset: Double, length: Double): js.Promise[_] = js.native
    
    def set(): js.Promise[_] = js.native
    def set(options: SetOptions): js.Promise[_] = js.native
    
    def update(): js.Promise[_] = js.native
    def update(options: UpdateOptions): js.Promise[_] = js.native
    
    def write(data: Buffer): js.Promise[_] = js.native
  }
  object BaseBinding {
    
    /* static member */
    @JSImport("serialport", "BaseBinding.list")
    @js.native
    def list(): js.Promise[js.Array[PortInfo]] = js.native
  }
  
  /* static member */
  @JSImport("serialport", "Binding")
  @js.native
  def Binding: BaseBinding = js.native
  @scala.inline
  def Binding_=(x: BaseBinding): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Binding")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("serialport", "list")
  @js.native
  def list(): js.Promise[js.Array[PortInfo]] = js.native
  
  object parsers {
    
    @JSImport("serialport", "parsers.ByteLength")
    @js.native
    class ByteLength protected () extends Transform {
      def this(options: Length) = this()
    }
    
    @JSImport("serialport", "parsers.CCTalk")
    @js.native
    class CCTalk () extends Transform
    
    @JSImport("serialport", "parsers.Delimiter")
    @js.native
    class Delimiter protected () extends Transform {
      def this(options: typingsSlinky.serialport.anon.Delimiter) = this()
    }
    
    @JSImport("serialport", "parsers.Readline")
    @js.native
    class Readline protected () extends Delimiter {
      def this(options: Encoding) = this()
    }
    
    @JSImport("serialport", "parsers.Ready")
    @js.native
    class Ready protected () extends Transform {
      def this(options: `0`) = this()
    }
    
    @JSImport("serialport", "parsers.Regex")
    @js.native
    class Regex protected () extends Transform {
      def this(options: typingsSlinky.serialport.anon.Regex) = this()
    }
  }
  
  // Callbacks Type Defs
  type ErrorCallback = js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
  
  type ModemBitsCallback = js.Function2[/* error */ js.UndefOr[js.Error | Null], /* status */ Cts, Unit]
  
  // Options Type Defs
  @js.native
  trait OpenOptions extends StObject {
    
    var autoOpen: js.UndefOr[Boolean] = js.native
    
    var baudRate: js.UndefOr[
        `115200` | `57600` | `38400` | `19200` | `9600` | `4800` | `2400` | `1800` | `1200` | `600` | `300` | `200` | `150` | `134` | `110` | `75` | `50` | Double
      ] = js.native
    
    var binding: js.UndefOr[BaseBinding] = js.native
    
    var bindingOptions: js.UndefOr[Vmin] = js.native
    
    var dataBits: js.UndefOr[`8` | `7` | `6` | `5`] = js.native
    
    var highWaterMark: js.UndefOr[Double] = js.native
    
    var lock: js.UndefOr[Boolean] = js.native
    
    var parity: js.UndefOr[none | even | mark | odd | space] = js.native
    
    var rtscts: js.UndefOr[Boolean] = js.native
    
    var stopBits: js.UndefOr[`1` | `2`] = js.native
    
    var xany: js.UndefOr[Boolean] = js.native
    
    var xoff: js.UndefOr[Boolean] = js.native
    
    var xon: js.UndefOr[Boolean] = js.native
  }
  object OpenOptions {
    
    @scala.inline
    def apply(): OpenOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OpenOptions]
    }
    
    @scala.inline
    implicit class OpenOptionsMutableBuilder[Self <: OpenOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoOpen(value: Boolean): Self = StObject.set(x, "autoOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoOpenUndefined: Self = StObject.set(x, "autoOpen", js.undefined)
      
      @scala.inline
      def setBaudRate(
        value: `115200` | `57600` | `38400` | `19200` | `9600` | `4800` | `2400` | `1800` | `1200` | `600` | `300` | `200` | `150` | `134` | `110` | `75` | `50` | Double
      ): Self = StObject.set(x, "baudRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaudRateUndefined: Self = StObject.set(x, "baudRate", js.undefined)
      
      @scala.inline
      def setBinding(value: BaseBinding): Self = StObject.set(x, "binding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBindingOptions(value: Vmin): Self = StObject.set(x, "bindingOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBindingOptionsUndefined: Self = StObject.set(x, "bindingOptions", js.undefined)
      
      @scala.inline
      def setBindingUndefined: Self = StObject.set(x, "binding", js.undefined)
      
      @scala.inline
      def setDataBits(value: `8` | `7` | `6` | `5`): Self = StObject.set(x, "dataBits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataBitsUndefined: Self = StObject.set(x, "dataBits", js.undefined)
      
      @scala.inline
      def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
      
      @scala.inline
      def setLock(value: Boolean): Self = StObject.set(x, "lock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLockUndefined: Self = StObject.set(x, "lock", js.undefined)
      
      @scala.inline
      def setParity(value: none | even | mark | odd | space): Self = StObject.set(x, "parity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParityUndefined: Self = StObject.set(x, "parity", js.undefined)
      
      @scala.inline
      def setRtscts(value: Boolean): Self = StObject.set(x, "rtscts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRtsctsUndefined: Self = StObject.set(x, "rtscts", js.undefined)
      
      @scala.inline
      def setStopBits(value: `1` | `2`): Self = StObject.set(x, "stopBits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopBitsUndefined: Self = StObject.set(x, "stopBits", js.undefined)
      
      @scala.inline
      def setXany(value: Boolean): Self = StObject.set(x, "xany", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXanyUndefined: Self = StObject.set(x, "xany", js.undefined)
      
      @scala.inline
      def setXoff(value: Boolean): Self = StObject.set(x, "xoff", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXoffUndefined: Self = StObject.set(x, "xoff", js.undefined)
      
      @scala.inline
      def setXon(value: Boolean): Self = StObject.set(x, "xon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXonUndefined: Self = StObject.set(x, "xon", js.undefined)
    }
  }
  
  @js.native
  trait PortInfo extends StObject {
    
    var locationId: js.UndefOr[String] = js.native
    
    var manufacturer: js.UndefOr[String] = js.native
    
    var path: String = js.native
    
    var pnpId: js.UndefOr[String] = js.native
    
    var productId: js.UndefOr[String] = js.native
    
    var serialNumber: js.UndefOr[String] = js.native
    
    var vendorId: js.UndefOr[String] = js.native
  }
  object PortInfo {
    
    @scala.inline
    def apply(path: String): PortInfo = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[PortInfo]
    }
    
    @scala.inline
    implicit class PortInfoMutableBuilder[Self <: PortInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocationId(value: String): Self = StObject.set(x, "locationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationIdUndefined: Self = StObject.set(x, "locationId", js.undefined)
      
      @scala.inline
      def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManufacturerUndefined: Self = StObject.set(x, "manufacturer", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPnpId(value: String): Self = StObject.set(x, "pnpId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPnpIdUndefined: Self = StObject.set(x, "pnpId", js.undefined)
      
      @scala.inline
      def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
      
      @scala.inline
      def setSerialNumber(value: String): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSerialNumberUndefined: Self = StObject.set(x, "serialNumber", js.undefined)
      
      @scala.inline
      def setVendorId(value: String): Self = StObject.set(x, "vendorId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVendorIdUndefined: Self = StObject.set(x, "vendorId", js.undefined)
    }
  }
  
  @js.native
  trait SerialPort extends Duplex {
    
    val baudRate: Double = js.native
    
    val binding: BaseBinding = js.native
    
    def close(): Unit = js.native
    def close(callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]): Unit = js.native
    
    def drain(): Unit = js.native
    def drain(callback: ErrorCallback): Unit = js.native
    
    def flush(): Unit = js.native
    def flush(callback: ErrorCallback): Unit = js.native
    
    def get(): Unit = js.native
    def get(callback: ModemBitsCallback): Unit = js.native
    
    val isOpen: Boolean = js.native
    
    def open(): Unit = js.native
    def open(callback: ErrorCallback): Unit = js.native
    
    val path: String = js.native
    
    def set(options: SetOptions): Unit = js.native
    def set(options: SetOptions, callback: ErrorCallback): Unit = js.native
    
    def update(options: UpdateOptions): Unit = js.native
    def update(options: UpdateOptions, callback: ErrorCallback): Unit = js.native
    
    def write(
      buffer: String,
      encoding: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* bytesWritten */ Double, Unit]
    ): Boolean = js.native
    def write(
      buffer: js.Array[Double],
      encoding: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* bytesWritten */ Double, Unit]
    ): Boolean = js.native
    def write(
      buffer: Buffer,
      encoding: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* bytesWritten */ Double, Unit]
    ): Boolean = js.native
    def write(data: String): Boolean = js.native
    def write(
      data: String,
      callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* bytesWritten */ Double, Unit]
    ): Boolean = js.native
    def write(data: js.Array[Double]): Boolean = js.native
    def write(
      data: js.Array[Double],
      callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* bytesWritten */ Double, Unit]
    ): Boolean = js.native
    def write(data: Buffer): Boolean = js.native
    def write(
      data: Buffer,
      callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* bytesWritten */ Double, Unit]
    ): Boolean = js.native
    @JSName("write")
    def write_ascii(buffer: String, encoding: ascii): Boolean = js.native
    @JSName("write")
    def write_ascii(
      buffer: String,
      encoding: ascii,
      callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* bytesWritten */ Double, Unit]
    ): Boolean = js.native
    @JSName("write")
    def write_ascii(buffer: js.Array[Double], encoding: ascii): Boolean = js.native
    @JSName("write")
    def write_ascii(
      buffer: js.Array[Double],
      encoding: ascii,
      callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* bytesWritten */ Double, Unit]
    ): Boolean = js.native
    @JSName("write")
    def write_ascii(buffer: Buffer, encoding: ascii): Boolean = js.native
    @JSName("write")
    def write_ascii(
      buffer: Buffer,
      encoding: ascii,
      callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* bytesWritten */ Double, Unit]
    ): Boolean = js.native
    @JSName("write")
    def write_base64(buffer: String, encoding: base64): Boolean = js.native
    @JSName("write")
    def write_base64(
      buffer: String,
      encoding: base64,
      callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* bytesWritten */ Double, Unit]
    ): Boolean = js.native
    @JSName("write")
    def write_base64(buffer: js.Array[Double], encoding: base64): Boolean = js.native
    @JSName("write")
    def write_base64(
      buffer: js.Array[Double],
      encoding: base64,
      callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* bytesWritten */ Double, Unit]
    ): Boolean = js.native
    @JSName("write")
    def write_base64(buffer: Buffer, encoding: base64): Boolean = js.native
    @JSName("write")
    def write_base64(
      buffer: Buffer,
      encoding: base64,
      callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* bytesWritten */ Double, Unit]
    ): Boolean = js.native
    @JSName("write")
    def write_binary(buffer: String, encoding: binary): Boolean = js.native
    @JSName("write")
    def write_binary(
      buffer: String,
      encoding: binary,
      callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* bytesWritten */ Double, Unit]
    ): Boolean = js.native
    @JSName("write")
    def write_binary(buffer: js.Array[Double], encoding: binary): Boolean = js.native
    @JSName("write")
    def write_binary(
      buffer: js.Array[Double],
      encoding: binary,
      callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* bytesWritten */ Double, Unit]
    ): Boolean = js.native
    @JSName("write")
    def write_binary(buffer: Buffer, encoding: binary): Boolean = js.native
    @JSName("write")
    def write_binary(
      buffer: Buffer,
      encoding: binary,
      callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* bytesWritten */ Double, Unit]
    ): Boolean = js.native
    @JSName("write")
    def write_hex(buffer: String, encoding: hex): Boolean = js.native
    @JSName("write")
    def write_hex(
      buffer: String,
      encoding: hex,
      callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* bytesWritten */ Double, Unit]
    ): Boolean = js.native
    @JSName("write")
    def write_hex(buffer: js.Array[Double], encoding: hex): Boolean = js.native
    @JSName("write")
    def write_hex(
      buffer: js.Array[Double],
      encoding: hex,
      callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* bytesWritten */ Double, Unit]
    ): Boolean = js.native
    @JSName("write")
    def write_hex(buffer: Buffer, encoding: hex): Boolean = js.native
    @JSName("write")
    def write_hex(
      buffer: Buffer,
      encoding: hex,
      callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* bytesWritten */ Double, Unit]
    ): Boolean = js.native
    @JSName("write")
    def write_ucs2(buffer: String, encoding: ucs2): Boolean = js.native
    @JSName("write")
    def write_ucs2(
      buffer: String,
      encoding: ucs2,
      callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* bytesWritten */ Double, Unit]
    ): Boolean = js.native
    @JSName("write")
    def write_ucs2(buffer: js.Array[Double], encoding: ucs2): Boolean = js.native
    @JSName("write")
    def write_ucs2(
      buffer: js.Array[Double],
      encoding: ucs2,
      callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* bytesWritten */ Double, Unit]
    ): Boolean = js.native
    @JSName("write")
    def write_ucs2(buffer: Buffer, encoding: ucs2): Boolean = js.native
    @JSName("write")
    def write_ucs2(
      buffer: Buffer,
      encoding: ucs2,
      callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* bytesWritten */ Double, Unit]
    ): Boolean = js.native
    @JSName("write")
    def write_utf16le(buffer: String, encoding: utf16le): Boolean = js.native
    @JSName("write")
    def write_utf16le(
      buffer: String,
      encoding: utf16le,
      callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* bytesWritten */ Double, Unit]
    ): Boolean = js.native
    @JSName("write")
    def write_utf16le(buffer: js.Array[Double], encoding: utf16le): Boolean = js.native
    @JSName("write")
    def write_utf16le(
      buffer: js.Array[Double],
      encoding: utf16le,
      callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* bytesWritten */ Double, Unit]
    ): Boolean = js.native
    @JSName("write")
    def write_utf16le(buffer: Buffer, encoding: utf16le): Boolean = js.native
    @JSName("write")
    def write_utf16le(
      buffer: Buffer,
      encoding: utf16le,
      callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* bytesWritten */ Double, Unit]
    ): Boolean = js.native
    @JSName("write")
    def write_utf8(buffer: String, encoding: utf8): Boolean = js.native
    @JSName("write")
    def write_utf8(
      buffer: String,
      encoding: utf8,
      callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* bytesWritten */ Double, Unit]
    ): Boolean = js.native
    @JSName("write")
    def write_utf8(buffer: js.Array[Double], encoding: utf8): Boolean = js.native
    @JSName("write")
    def write_utf8(
      buffer: js.Array[Double],
      encoding: utf8,
      callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* bytesWritten */ Double, Unit]
    ): Boolean = js.native
    @JSName("write")
    def write_utf8(buffer: Buffer, encoding: utf8): Boolean = js.native
    @JSName("write")
    def write_utf8(
      buffer: Buffer,
      encoding: utf8,
      callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* bytesWritten */ Double, Unit]
    ): Boolean = js.native
  }
  
  @js.native
  trait SetOptions extends StObject {
    
    var brk: js.UndefOr[Boolean] = js.native
    
    var cts: js.UndefOr[Boolean] = js.native
    
    var dsr: js.UndefOr[Boolean] = js.native
    
    var dtr: js.UndefOr[Boolean] = js.native
    
    var rts: js.UndefOr[Boolean] = js.native
  }
  object SetOptions {
    
    @scala.inline
    def apply(): SetOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SetOptions]
    }
    
    @scala.inline
    implicit class SetOptionsMutableBuilder[Self <: SetOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBrk(value: Boolean): Self = StObject.set(x, "brk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrkUndefined: Self = StObject.set(x, "brk", js.undefined)
      
      @scala.inline
      def setCts(value: Boolean): Self = StObject.set(x, "cts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCtsUndefined: Self = StObject.set(x, "cts", js.undefined)
      
      @scala.inline
      def setDsr(value: Boolean): Self = StObject.set(x, "dsr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDsrUndefined: Self = StObject.set(x, "dsr", js.undefined)
      
      @scala.inline
      def setDtr(value: Boolean): Self = StObject.set(x, "dtr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDtrUndefined: Self = StObject.set(x, "dtr", js.undefined)
      
      @scala.inline
      def setRts(value: Boolean): Self = StObject.set(x, "rts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRtsUndefined: Self = StObject.set(x, "rts", js.undefined)
    }
  }
  
  @js.native
  trait UpdateOptions extends StObject {
    
    var baudRate: js.UndefOr[
        `115200` | `57600` | `38400` | `19200` | `9600` | `4800` | `2400` | `1800` | `1200` | `600` | `300` | `200` | `150` | `134` | `110` | `75` | `50` | Double
      ] = js.native
  }
  object UpdateOptions {
    
    @scala.inline
    def apply(): UpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateOptions]
    }
    
    @scala.inline
    implicit class UpdateOptionsMutableBuilder[Self <: UpdateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaudRate(
        value: `115200` | `57600` | `38400` | `19200` | `9600` | `4800` | `2400` | `1800` | `1200` | `600` | `300` | `200` | `150` | `134` | `110` | `75` | `50` | Double
      ): Self = StObject.set(x, "baudRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaudRateUndefined: Self = StObject.set(x, "baudRate", js.undefined)
    }
  }
  
  type darwinBinding = BaseBinding
  
  type linuxBinding = BaseBinding
  
  // Binding Type Defs
  type win32Binding = BaseBinding
}
