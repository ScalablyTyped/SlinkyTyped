package typingsSlinky.webtorrent.mod

import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLMediaElement
import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.EventEmitter
import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.webtorrent.anon.Autoplay
import typingsSlinky.webtorrent.anon.End
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TorrentFile extends EventEmitter {
  val downloaded: Double = js.native
  val length: Double = js.native
  val name: String = js.native
  val path: String = js.native
  val progress: Double = js.native
  def appendTo(rootElement: String): Unit = js.native
  def appendTo(
    rootElement: String,
    callback: js.Function2[/* err */ js.UndefOr[js.Error], /* element */ HTMLMediaElement, Unit]
  ): Unit = js.native
  def appendTo(rootElement: String, opts: Autoplay): Unit = js.native
  def appendTo(
    rootElement: String,
    opts: Autoplay,
    callback: js.Function2[/* err */ js.UndefOr[js.Error], /* element */ HTMLMediaElement, Unit]
  ): Unit = js.native
  def appendTo(rootElement: HTMLElement): Unit = js.native
  def appendTo(
    rootElement: HTMLElement,
    callback: js.Function2[/* err */ js.UndefOr[js.Error], /* element */ HTMLMediaElement, Unit]
  ): Unit = js.native
  def appendTo(rootElement: HTMLElement, opts: Autoplay): Unit = js.native
  def appendTo(
    rootElement: HTMLElement,
    opts: Autoplay,
    callback: js.Function2[/* err */ js.UndefOr[js.Error], /* element */ HTMLMediaElement, Unit]
  ): Unit = js.native
  def createReadStream(): ReadableStream = js.native
  def createReadStream(opts: End): ReadableStream = js.native
  def deselect(): Unit = js.native
  def getBlob(callback: js.Function2[/* err */ js.UndefOr[String | js.Error], /* blob */ js.UndefOr[Blob], Unit]): Unit = js.native
  def getBlobURL(
    callback: js.Function2[/* err */ js.UndefOr[String | js.Error], /* blobURL */ js.UndefOr[String], Unit]
  ): Unit = js.native
  def getBuffer(
    callback: js.Function2[/* err */ js.UndefOr[String | js.Error], /* buffer */ js.UndefOr[Buffer], Unit]
  ): Unit = js.native
  def renderTo(rootElement: String): Unit = js.native
  def renderTo(
    rootElement: String,
    callback: js.Function2[/* err */ js.UndefOr[js.Error], /* element */ HTMLMediaElement, Unit]
  ): Unit = js.native
  def renderTo(rootElement: String, opts: Autoplay): Unit = js.native
  def renderTo(
    rootElement: String,
    opts: Autoplay,
    callback: js.Function2[/* err */ js.UndefOr[js.Error], /* element */ HTMLMediaElement, Unit]
  ): Unit = js.native
  def renderTo(rootElement: HTMLMediaElement): Unit = js.native
  def renderTo(
    rootElement: HTMLMediaElement,
    callback: js.Function2[/* err */ js.UndefOr[js.Error], /* element */ HTMLMediaElement, Unit]
  ): Unit = js.native
  def renderTo(rootElement: HTMLMediaElement, opts: Autoplay): Unit = js.native
  def renderTo(
    rootElement: HTMLMediaElement,
    opts: Autoplay,
    callback: js.Function2[/* err */ js.UndefOr[js.Error], /* element */ HTMLMediaElement, Unit]
  ): Unit = js.native
  def select(): Unit = js.native
}

