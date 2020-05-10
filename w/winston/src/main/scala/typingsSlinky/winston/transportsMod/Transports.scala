package typingsSlinky.winston.transportsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transports extends js.Object {
  var Console: ConsoleTransportInstance = js.native
  var ConsoleTransportOptions: typingsSlinky.winston.transportsMod.ConsoleTransportOptions = js.native
  var File: FileTransportInstance = js.native
  var FileTransportOptions: typingsSlinky.winston.transportsMod.FileTransportOptions = js.native
  var Http: HttpTransportInstance = js.native
  var HttpTransportOptions: typingsSlinky.winston.transportsMod.HttpTransportOptions = js.native
  var Stream: StreamTransportInstance = js.native
  var StreamTransportOptions: typingsSlinky.winston.transportsMod.StreamTransportOptions = js.native
}

object Transports {
  @scala.inline
  def apply(
    Console: ConsoleTransportInstance,
    ConsoleTransportOptions: ConsoleTransportOptions,
    File: FileTransportInstance,
    FileTransportOptions: FileTransportOptions,
    Http: HttpTransportInstance,
    HttpTransportOptions: HttpTransportOptions,
    Stream: StreamTransportInstance,
    StreamTransportOptions: StreamTransportOptions
  ): Transports = {
    val __obj = js.Dynamic.literal(Console = Console.asInstanceOf[js.Any], ConsoleTransportOptions = ConsoleTransportOptions.asInstanceOf[js.Any], File = File.asInstanceOf[js.Any], FileTransportOptions = FileTransportOptions.asInstanceOf[js.Any], Http = Http.asInstanceOf[js.Any], HttpTransportOptions = HttpTransportOptions.asInstanceOf[js.Any], Stream = Stream.asInstanceOf[js.Any], StreamTransportOptions = StreamTransportOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transports]
  }
  @scala.inline
  implicit class TransportsOps[Self <: Transports] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConsole(value: ConsoleTransportInstance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Console")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConsoleTransportOptions(value: ConsoleTransportOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConsoleTransportOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFile(value: FileTransportInstance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("File")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileTransportOptions(value: FileTransportOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileTransportOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHttp(value: HttpTransportInstance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Http")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHttpTransportOptions(value: HttpTransportOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HttpTransportOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStream(value: StreamTransportInstance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Stream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStreamTransportOptions(value: StreamTransportOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamTransportOptions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

