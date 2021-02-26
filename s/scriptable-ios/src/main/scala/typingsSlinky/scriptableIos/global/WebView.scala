package typingsSlinky.scriptableIos.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Presents websites and evaluates JavaScript on websites._
  *
  * Constructs a new web view. Use a web view to evaluate JavaScript on websites.
  * @see https://docs.scriptable.app/webview/#-new-webview
  */
@JSGlobal("WebView")
@js.native
/**
  * _Presents websites and evaluates JavaScript on websites._
  *
  * Constructs a new web view. Use a web view to evaluate JavaScript on websites.
  * @see https://docs.scriptable.app/webview/#-new-webview
  */
class WebView ()
  extends typingsSlinky.scriptableIos.WebView
object WebView {
  
  /**
    * _Loads a file and renders it._
    *
    * Files can be of various types, including HTML files and images.
    *
    * The supplied HTML file can reference files and nested directories in the same directory as the HTML file resides.
    *
    * The optional `preferredSize` parameter is ignored unless the script is run in a Siri Shortcut.
    *
    * If you are displaying large images in a memory constrained envrionment, for example in a Siri Shortcut, you should use the WebView bridge instead of the QuickLook bridge. The
    * technical reason for this is that a Siri Shortcut and other app extension processes have very limited memory and loading a very large image will cause the app extension to be
    * terminated. However, the web view will run in a different process meaning that it is not affected by the same memory constraints.
    * @param fileURL - URL of the file to load and render.
    * @param preferredSize - Optional. Preferred size of the view. This size is not guaranteed to be respected and is only used when the script is run with Siri or in the Shortcuts app.
    * @param fullscreen - Optional. Set to true to present the web view in fullscreen. This only has an effect when used within the app. Defaults to false.
    * @see https://docs.scriptable.app/webview/#loadfile
    */
  /* static member */
  @JSGlobal("WebView.loadFile")
  @js.native
  def loadFile(fileURL: String): js.Promise[Unit] = js.native
  @JSGlobal("WebView.loadFile")
  @js.native
  def loadFile(fileURL: String, preferredSize: js.UndefOr[scala.Nothing], fullscreen: Boolean): js.Promise[Unit] = js.native
  @JSGlobal("WebView.loadFile")
  @js.native
  def loadFile(fileURL: String, preferredSize: typingsSlinky.scriptableIos.Size): js.Promise[Unit] = js.native
  @JSGlobal("WebView.loadFile")
  @js.native
  def loadFile(fileURL: String, preferredSize: typingsSlinky.scriptableIos.Size, fullscreen: Boolean): js.Promise[Unit] = js.native
  
  /**
    * _Loads HTML and renders it._
    * @param html - HTML to load and render.
    * @param baseURL - Optional. Base URL used to resolve relative URLs in the HTML.
    * @param preferredSize - Optional. Preferred size of the view. This size is not guaranteed to be respected and is only used when the script is run with Siri or in the Shortcuts app.
    * @param fullscreen - Optional. Set to true to present the web view in fullscreen. This only has an effect when used within the app. Defaults to false.
    * @see https://docs.scriptable.app/webview/#loadhtml
    */
  /* static member */
  @JSGlobal("WebView.loadHTML")
  @js.native
  def loadHTML(html: String): js.Promise[Unit] = js.native
  @JSGlobal("WebView.loadHTML")
  @js.native
  def loadHTML(
    html: String,
    baseURL: js.UndefOr[scala.Nothing],
    preferredSize: js.UndefOr[scala.Nothing],
    fullscreen: Boolean
  ): js.Promise[Unit] = js.native
  @JSGlobal("WebView.loadHTML")
  @js.native
  def loadHTML(html: String, baseURL: js.UndefOr[scala.Nothing], preferredSize: typingsSlinky.scriptableIos.Size): js.Promise[Unit] = js.native
  @JSGlobal("WebView.loadHTML")
  @js.native
  def loadHTML(
    html: String,
    baseURL: js.UndefOr[scala.Nothing],
    preferredSize: typingsSlinky.scriptableIos.Size,
    fullscreen: Boolean
  ): js.Promise[Unit] = js.native
  @JSGlobal("WebView.loadHTML")
  @js.native
  def loadHTML(html: String, baseURL: String): js.Promise[Unit] = js.native
  @JSGlobal("WebView.loadHTML")
  @js.native
  def loadHTML(html: String, baseURL: String, preferredSize: js.UndefOr[scala.Nothing], fullscreen: Boolean): js.Promise[Unit] = js.native
  @JSGlobal("WebView.loadHTML")
  @js.native
  def loadHTML(html: String, baseURL: String, preferredSize: typingsSlinky.scriptableIos.Size): js.Promise[Unit] = js.native
  @JSGlobal("WebView.loadHTML")
  @js.native
  def loadHTML(
    html: String,
    baseURL: String,
    preferredSize: typingsSlinky.scriptableIos.Size,
    fullscreen: Boolean
  ): js.Promise[Unit] = js.native
  
  /**
    * _Loads URL in web view and presents the web view._
    *
    * The optional `preferredSize` parameter is ignored unless the script is run in a Siri Shortcut.
    * @param url - URL to load into the web view.
    * @param preferredSize - Optional. Preferred size of the view. This size is not guaranteed to be respected and is only used when the script is run with Siri or in the Shortcuts app.
    * @param fullscreen - Optional. Set to true to present the web view in fullscreen. This only has an effect when used within the app. Defaults to false.
    * @see https://docs.scriptable.app/webview/#loadurl
    */
  /* static member */
  @JSGlobal("WebView.loadURL")
  @js.native
  def loadURL(url: String): js.Promise[Unit] = js.native
  @JSGlobal("WebView.loadURL")
  @js.native
  def loadURL(url: String, preferredSize: js.UndefOr[scala.Nothing], fullscreen: Boolean): js.Promise[Unit] = js.native
  @JSGlobal("WebView.loadURL")
  @js.native
  def loadURL(url: String, preferredSize: typingsSlinky.scriptableIos.Size): js.Promise[Unit] = js.native
  @JSGlobal("WebView.loadURL")
  @js.native
  def loadURL(url: String, preferredSize: typingsSlinky.scriptableIos.Size, fullscreen: Boolean): js.Promise[Unit] = js.native
}
