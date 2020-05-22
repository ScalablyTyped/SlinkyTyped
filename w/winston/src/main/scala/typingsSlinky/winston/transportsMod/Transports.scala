package typingsSlinky.winston.transportsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transports extends js.Object {
  var Console: ConsoleTransportInstance
  var ConsoleTransportOptions: typingsSlinky.winston.transportsMod.ConsoleTransportOptions
  var File: FileTransportInstance
  var FileTransportOptions: typingsSlinky.winston.transportsMod.FileTransportOptions
  var Http: HttpTransportInstance
  var HttpTransportOptions: typingsSlinky.winston.transportsMod.HttpTransportOptions
  var Stream: StreamTransportInstance
  var StreamTransportOptions: typingsSlinky.winston.transportsMod.StreamTransportOptions
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
}

