package typingsSlinky.wavesurferJs

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.AudioContext
import org.scalajs.dom.raw.AudioNode
import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.CanvasGradient
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.File
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLMediaElement
import typingsSlinky.std.ScriptProcessorNode
import typingsSlinky.wavesurferJs.anon.Instantiable
import typingsSlinky.wavesurferJs.anon.InstantiableWaveSurferPlugin
import typingsSlinky.wavesurferJs.anon.Xhr
import typingsSlinky.wavesurferJs.wavesurferJsStrings.MediaElement
import typingsSlinky.wavesurferJs.wavesurferJsStrings.MediaElementWebAudio
import typingsSlinky.wavesurferJs.wavesurferJsStrings.WebAudio
import typingsSlinky.wavesurferJs.wavesurferJsStrings.blob
import typingsSlinky.wavesurferJs.wavesurferJsStrings.dataURL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("wavesurfer.js", JSImport.Namespace)
  @js.native
  class ^ protected () extends WaveSurfer {
    def this(params: WaveSurferParams) = this()
  }
  @JSImport("wavesurfer.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("wavesurfer.js", "VERSION")
  @js.native
  def VERSION: String = js.native
  @scala.inline
  def VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])
  
  @JSImport("wavesurfer.js", "WaveRenderer")
  @js.native
  class WaveRenderer protected () extends Observer {
    def this(container: HTMLElement, params: WaveSurferParams) = this()
    
    def clearWave(): Unit = js.native
    
    def createWrapper(): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def drawBars(peaks: js.Array[js.Array[Double] | Double], channelIndex: Double, start: Double, end: Double): Unit = js.native
    
    def drawPeaks(peaks: js.Array[js.Array[Double] | Double], length: Double, start: Double, end: Double): Unit = js.native
    
    def drawWave(peaks: js.Array[js.Array[Double] | Double], channelIndex: Double, start: Double, end: Double): Unit = js.native
    
    def getScrollX(): Double = js.native
    
    def getWidth(): Double = js.native
    
    def handleEvent(e: Event, noPrevent: Boolean): Double = js.native
    
    var height: Double = js.native
    
    def progress(progress: Double): Unit = js.native
    
    def recenter(percent: Double): Unit = js.native
    
    def recenterOnPosition(position: Double, immediate: Boolean): Unit = js.native
    
    def resetScroll(): Unit = js.native
    
    def setHeight(height: Double): Boolean = js.native
    
    def setWidth(width: Double): Boolean = js.native
    
    def style(el: HTMLElement, styles: StringDictionary[String]): HTMLElement = js.native
    
    def updateProgress(position: Double): Unit = js.native
    
    def updateSize(): Unit = js.native
    
    var width: Double = js.native
    
    var wrapper: HTMLElement = js.native
  }
  
  @JSImport("wavesurfer.js", "WaveSurferPlugin")
  @js.native
  class WaveSurferPlugin protected () extends StObject {
    def this(params: js.Object, ws: WaveSurfer) = this()
    
    def destroy(): Unit = js.native
    
    def init(): Unit = js.native
  }
  object WaveSurferPlugin {
    
    /* static member */
    @JSImport("wavesurfer.js", "WaveSurferPlugin.create")
    @js.native
    def create(params: js.Object): PluginDefinition = js.native
  }
  
  /* static member */
  @JSImport("wavesurfer.js", "create")
  @js.native
  def create(params: WaveSurferParams): WaveSurfer = js.native
  
  /* static member */
  @JSImport("wavesurfer.js", "util")
  @js.native
  def util: WaveSurferUtil = js.native
  @scala.inline
  def util_=(x: WaveSurferUtil): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("util")(x.asInstanceOf[js.Any])
  
  @js.native
  trait ListenerDescriptor extends StObject {
    
    def callback(args: js.Any*): Unit = js.native
    
    var name: String = js.native
    
    def un(): Unit = js.native
  }
  object ListenerDescriptor {
    
    @scala.inline
    def apply(callback: /* repeated */ js.Any => Unit, name: String, un: () => Unit): ListenerDescriptor = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), name = name.asInstanceOf[js.Any], un = js.Any.fromFunction0(un))
      __obj.asInstanceOf[ListenerDescriptor]
    }
    
    @scala.inline
    implicit class ListenerDescriptorMutableBuilder[Self <: ListenerDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallback(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUn(value: () => Unit): Self = StObject.set(x, "un", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Observer extends StObject {
    
    def fireEvent(eventName: String, args: js.Any*): Unit = js.native
    
    def on(eventName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): ListenerDescriptor = js.native
    
    def once(eventName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): ListenerDescriptor = js.native
    
    def un(eventName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
    
    def unAll(): Unit = js.native
  }
  object Observer {
    
    @scala.inline
    def apply(
      fireEvent: (String, /* repeated */ js.Any) => Unit,
      on: (String, js.Function1[/* repeated */ js.Any, Unit]) => ListenerDescriptor,
      once: (String, js.Function1[/* repeated */ js.Any, Unit]) => ListenerDescriptor,
      un: (String, js.Function1[/* repeated */ js.Any, Unit]) => Unit,
      unAll: () => Unit
    ): Observer = {
      val __obj = js.Dynamic.literal(fireEvent = js.Any.fromFunction2(fireEvent), on = js.Any.fromFunction2(on), once = js.Any.fromFunction2(once), un = js.Any.fromFunction2(un), unAll = js.Any.fromFunction0(unAll))
      __obj.asInstanceOf[Observer]
    }
    
    @scala.inline
    implicit class ObserverMutableBuilder[Self <: Observer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFireEvent(value: (String, /* repeated */ js.Any) => Unit): Self = StObject.set(x, "fireEvent", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOn(value: (String, js.Function1[/* repeated */ js.Any, Unit]) => ListenerDescriptor): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnce(value: (String, js.Function1[/* repeated */ js.Any, Unit]) => ListenerDescriptor): Self = StObject.set(x, "once", js.Any.fromFunction2(value))
      
      @scala.inline
      def setUn(value: (String, js.Function1[/* repeated */ js.Any, Unit]) => Unit): Self = StObject.set(x, "un", js.Any.fromFunction2(value))
      
      @scala.inline
      def setUnAll(value: () => Unit): Self = StObject.set(x, "unAll", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait PluginDefinition extends StObject {
    
    var deferInit: js.UndefOr[Boolean] = js.native
    
    var instance: InstantiableWaveSurferPlugin = js.native
    
    var name: String = js.native
    
    var params: js.Object = js.native
    
    var staticProps: js.UndefOr[js.Object] = js.native
  }
  object PluginDefinition {
    
    @scala.inline
    def apply(instance: InstantiableWaveSurferPlugin, name: String, params: js.Object): PluginDefinition = {
      val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[PluginDefinition]
    }
    
    @scala.inline
    implicit class PluginDefinitionMutableBuilder[Self <: PluginDefinition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeferInit(value: Boolean): Self = StObject.set(x, "deferInit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeferInitUndefined: Self = StObject.set(x, "deferInit", js.undefined)
      
      @scala.inline
      def setInstance(value: InstantiableWaveSurferPlugin): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaticProps(value: js.Object): Self = StObject.set(x, "staticProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaticPropsUndefined: Self = StObject.set(x, "staticProps", js.undefined)
    }
  }
  
  @js.native
  trait WaveSurfer
    extends Observer
       with // [x: string]: any
  //   pluginName -> WaveSurferPlugin
  //   propertyNameAddedByPlugin -> any
  /* x */ StringDictionary[js.Any] {
    
    def addPlugin(plugin: PluginDefinition): WaveSurfer = js.native
    
    var backend: WaveSurferBackend = js.native
    
    def cancelAjax(): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def destroyPlugin(name: String): WaveSurfer = js.native
    
    def empty(): Unit = js.native
    
    def exportImage(): String | js.Array[String] | js.Promise[js.Array[Blob]] = js.native
    def exportImage(format: js.UndefOr[scala.Nothing], quality: Double): String | js.Array[String] | js.Promise[js.Array[Blob]] = js.native
    def exportImage(format: String): String | js.Array[String] | js.Promise[js.Array[Blob]] = js.native
    def exportImage(format: String, quality: Double): String | js.Array[String] | js.Promise[js.Array[Blob]] = js.native
    @JSName("exportImage")
    def exportImage_blob(format: js.UndefOr[scala.Nothing], quality: js.UndefOr[scala.Nothing], `type`: blob): String | js.Array[String] | js.Promise[js.Array[Blob]] = js.native
    @JSName("exportImage")
    def exportImage_blob(format: js.UndefOr[scala.Nothing], quality: Double, `type`: blob): String | js.Array[String] | js.Promise[js.Array[Blob]] = js.native
    @JSName("exportImage")
    def exportImage_blob(format: String, quality: js.UndefOr[scala.Nothing], `type`: blob): String | js.Array[String] | js.Promise[js.Array[Blob]] = js.native
    @JSName("exportImage")
    def exportImage_blob(format: String, quality: Double, `type`: blob): String | js.Array[String] | js.Promise[js.Array[Blob]] = js.native
    @JSName("exportImage")
    def exportImage_dataURL(format: js.UndefOr[scala.Nothing], quality: js.UndefOr[scala.Nothing], `type`: dataURL): String | js.Array[String] | js.Promise[js.Array[Blob]] = js.native
    @JSName("exportImage")
    def exportImage_dataURL(format: js.UndefOr[scala.Nothing], quality: Double, `type`: dataURL): String | js.Array[String] | js.Promise[js.Array[Blob]] = js.native
    @JSName("exportImage")
    def exportImage_dataURL(format: String, quality: js.UndefOr[scala.Nothing], `type`: dataURL): String | js.Array[String] | js.Promise[js.Array[Blob]] = js.native
    @JSName("exportImage")
    def exportImage_dataURL(format: String, quality: Double, `type`: dataURL): String | js.Array[String] | js.Promise[js.Array[Blob]] = js.native
    
    def exportPCM(): js.Promise[String] = js.native
    def exportPCM(
      length: js.UndefOr[scala.Nothing],
      accuracy: js.UndefOr[scala.Nothing],
      noWindow: js.UndefOr[scala.Nothing],
      start: js.UndefOr[scala.Nothing],
      end: Double
    ): js.Promise[String] = js.native
    def exportPCM(
      length: js.UndefOr[scala.Nothing],
      accuracy: js.UndefOr[scala.Nothing],
      noWindow: js.UndefOr[scala.Nothing],
      start: Double
    ): js.Promise[String] = js.native
    def exportPCM(
      length: js.UndefOr[scala.Nothing],
      accuracy: js.UndefOr[scala.Nothing],
      noWindow: js.UndefOr[scala.Nothing],
      start: Double,
      end: Double
    ): js.Promise[String] = js.native
    def exportPCM(length: js.UndefOr[scala.Nothing], accuracy: js.UndefOr[scala.Nothing], noWindow: Boolean): js.Promise[String] = js.native
    def exportPCM(
      length: js.UndefOr[scala.Nothing],
      accuracy: js.UndefOr[scala.Nothing],
      noWindow: Boolean,
      start: js.UndefOr[scala.Nothing],
      end: Double
    ): js.Promise[String] = js.native
    def exportPCM(
      length: js.UndefOr[scala.Nothing],
      accuracy: js.UndefOr[scala.Nothing],
      noWindow: Boolean,
      start: Double
    ): js.Promise[String] = js.native
    def exportPCM(
      length: js.UndefOr[scala.Nothing],
      accuracy: js.UndefOr[scala.Nothing],
      noWindow: Boolean,
      start: Double,
      end: Double
    ): js.Promise[String] = js.native
    def exportPCM(length: js.UndefOr[scala.Nothing], accuracy: Double): js.Promise[String] = js.native
    def exportPCM(
      length: js.UndefOr[scala.Nothing],
      accuracy: Double,
      noWindow: js.UndefOr[scala.Nothing],
      start: js.UndefOr[scala.Nothing],
      end: Double
    ): js.Promise[String] = js.native
    def exportPCM(
      length: js.UndefOr[scala.Nothing],
      accuracy: Double,
      noWindow: js.UndefOr[scala.Nothing],
      start: Double
    ): js.Promise[String] = js.native
    def exportPCM(
      length: js.UndefOr[scala.Nothing],
      accuracy: Double,
      noWindow: js.UndefOr[scala.Nothing],
      start: Double,
      end: Double
    ): js.Promise[String] = js.native
    def exportPCM(length: js.UndefOr[scala.Nothing], accuracy: Double, noWindow: Boolean): js.Promise[String] = js.native
    def exportPCM(
      length: js.UndefOr[scala.Nothing],
      accuracy: Double,
      noWindow: Boolean,
      start: js.UndefOr[scala.Nothing],
      end: Double
    ): js.Promise[String] = js.native
    def exportPCM(length: js.UndefOr[scala.Nothing], accuracy: Double, noWindow: Boolean, start: Double): js.Promise[String] = js.native
    def exportPCM(length: js.UndefOr[scala.Nothing], accuracy: Double, noWindow: Boolean, start: Double, end: Double): js.Promise[String] = js.native
    def exportPCM(length: Double): js.Promise[String] = js.native
    def exportPCM(
      length: Double,
      accuracy: js.UndefOr[scala.Nothing],
      noWindow: js.UndefOr[scala.Nothing],
      start: js.UndefOr[scala.Nothing],
      end: Double
    ): js.Promise[String] = js.native
    def exportPCM(
      length: Double,
      accuracy: js.UndefOr[scala.Nothing],
      noWindow: js.UndefOr[scala.Nothing],
      start: Double
    ): js.Promise[String] = js.native
    def exportPCM(
      length: Double,
      accuracy: js.UndefOr[scala.Nothing],
      noWindow: js.UndefOr[scala.Nothing],
      start: Double,
      end: Double
    ): js.Promise[String] = js.native
    def exportPCM(length: Double, accuracy: js.UndefOr[scala.Nothing], noWindow: Boolean): js.Promise[String] = js.native
    def exportPCM(
      length: Double,
      accuracy: js.UndefOr[scala.Nothing],
      noWindow: Boolean,
      start: js.UndefOr[scala.Nothing],
      end: Double
    ): js.Promise[String] = js.native
    def exportPCM(length: Double, accuracy: js.UndefOr[scala.Nothing], noWindow: Boolean, start: Double): js.Promise[String] = js.native
    def exportPCM(length: Double, accuracy: js.UndefOr[scala.Nothing], noWindow: Boolean, start: Double, end: Double): js.Promise[String] = js.native
    def exportPCM(length: Double, accuracy: Double): js.Promise[String] = js.native
    def exportPCM(
      length: Double,
      accuracy: Double,
      noWindow: js.UndefOr[scala.Nothing],
      start: js.UndefOr[scala.Nothing],
      end: Double
    ): js.Promise[String] = js.native
    def exportPCM(length: Double, accuracy: Double, noWindow: js.UndefOr[scala.Nothing], start: Double): js.Promise[String] = js.native
    def exportPCM(length: Double, accuracy: Double, noWindow: js.UndefOr[scala.Nothing], start: Double, end: Double): js.Promise[String] = js.native
    def exportPCM(length: Double, accuracy: Double, noWindow: Boolean): js.Promise[String] = js.native
    def exportPCM(length: Double, accuracy: Double, noWindow: Boolean, start: js.UndefOr[scala.Nothing], end: Double): js.Promise[String] = js.native
    def exportPCM(length: Double, accuracy: Double, noWindow: Boolean, start: Double): js.Promise[String] = js.native
    def exportPCM(length: Double, accuracy: Double, noWindow: Boolean, start: Double, end: Double): js.Promise[String] = js.native
    
    def getActivePlugins(): js.Object = js.native
    
    def getBackgroundColor(): String = js.native
    
    def getCurrentTime(): Double = js.native
    
    def getCursorColor(): String = js.native
    
    def getDuration(): Double = js.native
    
    def getFilters(): js.Array[AudioNode] = js.native
    
    def getHeight(): Double = js.native
    
    def getMute(): Boolean = js.native
    
    def getPlaybackRate(): Double = js.native
    
    def getProgressColor(): String = js.native
    
    def getVolume(): Double = js.native
    
    def getWaveColor(): CanvasGradient | String = js.native
    
    def init(): WaveSurfer = js.native
    
    def initPlugin(name: String): WaveSurfer = js.native
    
    def isPlaying(): Boolean = js.native
    
    def isReady(): Boolean = js.native
    
    def load(url: String): Unit = js.native
    def load(
      url: String,
      peaks: js.UndefOr[scala.Nothing],
      preload: js.UndefOr[scala.Nothing],
      duration: Double
    ): Unit = js.native
    def load(url: String, peaks: js.UndefOr[scala.Nothing], preload: String): Unit = js.native
    def load(url: String, peaks: js.UndefOr[scala.Nothing], preload: String, duration: Double): Unit = js.native
    def load(url: String, peaks: js.Array[js.Array[Double] | Double]): Unit = js.native
    def load(
      url: String,
      peaks: js.Array[js.Array[Double] | Double],
      preload: js.UndefOr[scala.Nothing],
      duration: Double
    ): Unit = js.native
    def load(url: String, peaks: js.Array[js.Array[Double] | Double], preload: String): Unit = js.native
    def load(url: String, peaks: js.Array[js.Array[Double] | Double], preload: String, duration: Double): Unit = js.native
    def load(url: HTMLMediaElement): Unit = js.native
    def load(
      url: HTMLMediaElement,
      peaks: js.UndefOr[scala.Nothing],
      preload: js.UndefOr[scala.Nothing],
      duration: Double
    ): Unit = js.native
    def load(url: HTMLMediaElement, peaks: js.UndefOr[scala.Nothing], preload: String): Unit = js.native
    def load(url: HTMLMediaElement, peaks: js.UndefOr[scala.Nothing], preload: String, duration: Double): Unit = js.native
    def load(url: HTMLMediaElement, peaks: js.Array[js.Array[Double] | Double]): Unit = js.native
    def load(
      url: HTMLMediaElement,
      peaks: js.Array[js.Array[Double] | Double],
      preload: js.UndefOr[scala.Nothing],
      duration: Double
    ): Unit = js.native
    def load(url: HTMLMediaElement, peaks: js.Array[js.Array[Double] | Double], preload: String): Unit = js.native
    def load(
      url: HTMLMediaElement,
      peaks: js.Array[js.Array[Double] | Double],
      preload: String,
      duration: Double
    ): Unit = js.native
    
    def loadBlob(url: Blob): Unit = js.native
    def loadBlob(url: File): Unit = js.native
    
    def pause(): js.UndefOr[js.Promise[Unit]] = js.native
    
    def play(): js.UndefOr[js.Promise[Unit]] = js.native
    def play(start: js.UndefOr[scala.Nothing], end: Double): js.UndefOr[js.Promise[Unit]] = js.native
    def play(start: Double): js.UndefOr[js.Promise[Unit]] = js.native
    def play(start: Double, end: Double): js.UndefOr[js.Promise[Unit]] = js.native
    
    def playPause(): js.UndefOr[js.Promise[Unit]] = js.native
    
    def registerPlugins(plugins: js.Array[PluginDefinition]): WaveSurfer = js.native
    
    def seekAndCenter(progress: Double): Unit = js.native
    
    def seekTo(progress: Double): Unit = js.native
    
    def setBackgroundColor(color: String): Unit = js.native
    
    def setCurrentTime(seconds: Double): Unit = js.native
    
    def setCursorColor(color: String): Unit = js.native
    
    def setHeight(height: Double): Unit = js.native
    
    def setMute(mute: Boolean): Unit = js.native
    
    def setPlayEnd(position: Double): Unit = js.native
    
    def setPlaybackRate(rate: Double): Unit = js.native
    
    def setSinkId(deviceId: String): js.Promise[_] = js.native
    
    def setVolume(newVolume: Double): Unit = js.native
    
    def setWaveColor(color: String): Unit = js.native
    def setWaveColor(color: CanvasGradient): Unit = js.native
    
    def skip(offset: Double): Unit = js.native
    
    def skipBackward(): Unit = js.native
    def skipBackward(seconds: Double): Unit = js.native
    
    def skipForward(): Unit = js.native
    def skipForward(seconds: Double): Unit = js.native
    
    def stop(): Unit = js.native
    
    def toggleInteraction(): Unit = js.native
    
    def toggleMute(): Unit = js.native
    
    def toggleScroll(): Unit = js.native
    
    var util: WaveSurferUtil = js.native
    
    def zoom(): Unit = js.native
    def zoom(pxPerSec: Double): Unit = js.native
  }
  
  @js.native
  trait WaveSurferBackend extends StObject {
    
    def getPeaks(length: Double): js.Array[js.Array[Double] | Double] = js.native
    def getPeaks(length: Double, first: js.UndefOr[scala.Nothing], last: Double): js.Array[js.Array[Double] | Double] = js.native
    def getPeaks(length: Double, first: Double): js.Array[js.Array[Double] | Double] = js.native
    def getPeaks(length: Double, first: Double, last: Double): js.Array[js.Array[Double] | Double] = js.native
  }
  
  @js.native
  trait WaveSurferParams extends StObject {
    
    var audioContext: js.UndefOr[AudioContext] = js.native
    
    var audioRate: js.UndefOr[Double] = js.native
    
    var audioScriptProcessor: js.UndefOr[ScriptProcessorNode] = js.native
    
    var autoCenter: js.UndefOr[Boolean] = js.native
    
    var autoCenterImmediately: js.UndefOr[Boolean] = js.native
    
    var autoCenterRate: js.UndefOr[Double] = js.native
    
    var backend: js.UndefOr[WebAudio | MediaElement | MediaElementWebAudio] = js.native
    
    var backgroundColor: js.UndefOr[String] = js.native
    
    var barGap: js.UndefOr[Double] = js.native
    
    var barHeight: js.UndefOr[Double] = js.native
    
    var barMinHeight: js.UndefOr[Double] = js.native
    
    var barRadius: js.UndefOr[Double] = js.native
    
    var barWidth: js.UndefOr[Double] = js.native
    
    var closeAudioContext: js.UndefOr[Boolean] = js.native
    
    var container: String | HTMLElement = js.native
    
    var cursorColor: js.UndefOr[String] = js.native
    
    var cursorWidth: js.UndefOr[Double] = js.native
    
    var drawingContextAttributes: js.UndefOr[js.Object] = js.native
    
    var duration: js.UndefOr[Double] = js.native
    
    var fillParent: js.UndefOr[Boolean] = js.native
    
    var forceDecode: js.UndefOr[Boolean] = js.native
    
    var height: js.UndefOr[Double] = js.native
    
    var hideScrollbar: js.UndefOr[Boolean] = js.native
    
    var interact: js.UndefOr[Boolean] = js.native
    
    var loopSelection: js.UndefOr[Boolean] = js.native
    
    var maxCanvasWidth: js.UndefOr[Double] = js.native
    
    var mediaControls: js.UndefOr[Boolean] = js.native
    
    var mediaType: js.UndefOr[String] = js.native
    
    var minPxPerSec: js.UndefOr[Double] = js.native
    
    var normalize: js.UndefOr[Boolean] = js.native
    
    var partialRender: js.UndefOr[Boolean] = js.native
    
    var pixelRatio: js.UndefOr[Double] = js.native
    
    var plugins: js.UndefOr[js.Array[PluginDefinition]] = js.native
    
    var progressColor: js.UndefOr[String] = js.native
    
    var removeMediaElementOnDestroy: js.UndefOr[Boolean] = js.native
    
    var renderer: js.UndefOr[Instantiable] = js.native
    
    var responsive: js.UndefOr[Boolean | Double] = js.native
    
    var rtl: js.UndefOr[Boolean] = js.native
    
    var scrollParent: js.UndefOr[Boolean] = js.native
    
    var skipLength: js.UndefOr[Double] = js.native
    
    var splitChannels: js.UndefOr[Boolean] = js.native
    
    var waveColor: js.UndefOr[String | CanvasGradient] = js.native
    
    var xhr: js.UndefOr[XHROptions] = js.native
  }
  object WaveSurferParams {
    
    @scala.inline
    def apply(container: String | HTMLElement): WaveSurferParams = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
      __obj.asInstanceOf[WaveSurferParams]
    }
    
    @scala.inline
    implicit class WaveSurferParamsMutableBuilder[Self <: WaveSurferParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAudioContext(value: AudioContext): Self = StObject.set(x, "audioContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudioContextUndefined: Self = StObject.set(x, "audioContext", js.undefined)
      
      @scala.inline
      def setAudioRate(value: Double): Self = StObject.set(x, "audioRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudioRateUndefined: Self = StObject.set(x, "audioRate", js.undefined)
      
      @scala.inline
      def setAudioScriptProcessor(value: ScriptProcessorNode): Self = StObject.set(x, "audioScriptProcessor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudioScriptProcessorUndefined: Self = StObject.set(x, "audioScriptProcessor", js.undefined)
      
      @scala.inline
      def setAutoCenter(value: Boolean): Self = StObject.set(x, "autoCenter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCenterImmediately(value: Boolean): Self = StObject.set(x, "autoCenterImmediately", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCenterImmediatelyUndefined: Self = StObject.set(x, "autoCenterImmediately", js.undefined)
      
      @scala.inline
      def setAutoCenterRate(value: Double): Self = StObject.set(x, "autoCenterRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCenterRateUndefined: Self = StObject.set(x, "autoCenterRate", js.undefined)
      
      @scala.inline
      def setAutoCenterUndefined: Self = StObject.set(x, "autoCenter", js.undefined)
      
      @scala.inline
      def setBackend(value: WebAudio | MediaElement | MediaElementWebAudio): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackendUndefined: Self = StObject.set(x, "backend", js.undefined)
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setBarGap(value: Double): Self = StObject.set(x, "barGap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBarGapUndefined: Self = StObject.set(x, "barGap", js.undefined)
      
      @scala.inline
      def setBarHeight(value: Double): Self = StObject.set(x, "barHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBarHeightUndefined: Self = StObject.set(x, "barHeight", js.undefined)
      
      @scala.inline
      def setBarMinHeight(value: Double): Self = StObject.set(x, "barMinHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBarMinHeightUndefined: Self = StObject.set(x, "barMinHeight", js.undefined)
      
      @scala.inline
      def setBarRadius(value: Double): Self = StObject.set(x, "barRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBarRadiusUndefined: Self = StObject.set(x, "barRadius", js.undefined)
      
      @scala.inline
      def setBarWidth(value: Double): Self = StObject.set(x, "barWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBarWidthUndefined: Self = StObject.set(x, "barWidth", js.undefined)
      
      @scala.inline
      def setCloseAudioContext(value: Boolean): Self = StObject.set(x, "closeAudioContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseAudioContextUndefined: Self = StObject.set(x, "closeAudioContext", js.undefined)
      
      @scala.inline
      def setContainer(value: String | HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerHTMLElement(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCursorColor(value: String): Self = StObject.set(x, "cursorColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCursorColorUndefined: Self = StObject.set(x, "cursorColor", js.undefined)
      
      @scala.inline
      def setCursorWidth(value: Double): Self = StObject.set(x, "cursorWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCursorWidthUndefined: Self = StObject.set(x, "cursorWidth", js.undefined)
      
      @scala.inline
      def setDrawingContextAttributes(value: js.Object): Self = StObject.set(x, "drawingContextAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrawingContextAttributesUndefined: Self = StObject.set(x, "drawingContextAttributes", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setFillParent(value: Boolean): Self = StObject.set(x, "fillParent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillParentUndefined: Self = StObject.set(x, "fillParent", js.undefined)
      
      @scala.inline
      def setForceDecode(value: Boolean): Self = StObject.set(x, "forceDecode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceDecodeUndefined: Self = StObject.set(x, "forceDecode", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHideScrollbar(value: Boolean): Self = StObject.set(x, "hideScrollbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideScrollbarUndefined: Self = StObject.set(x, "hideScrollbar", js.undefined)
      
      @scala.inline
      def setInteract(value: Boolean): Self = StObject.set(x, "interact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInteractUndefined: Self = StObject.set(x, "interact", js.undefined)
      
      @scala.inline
      def setLoopSelection(value: Boolean): Self = StObject.set(x, "loopSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopSelectionUndefined: Self = StObject.set(x, "loopSelection", js.undefined)
      
      @scala.inline
      def setMaxCanvasWidth(value: Double): Self = StObject.set(x, "maxCanvasWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxCanvasWidthUndefined: Self = StObject.set(x, "maxCanvasWidth", js.undefined)
      
      @scala.inline
      def setMediaControls(value: Boolean): Self = StObject.set(x, "mediaControls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediaControlsUndefined: Self = StObject.set(x, "mediaControls", js.undefined)
      
      @scala.inline
      def setMediaType(value: String): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediaTypeUndefined: Self = StObject.set(x, "mediaType", js.undefined)
      
      @scala.inline
      def setMinPxPerSec(value: Double): Self = StObject.set(x, "minPxPerSec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinPxPerSecUndefined: Self = StObject.set(x, "minPxPerSec", js.undefined)
      
      @scala.inline
      def setNormalize(value: Boolean): Self = StObject.set(x, "normalize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
      
      @scala.inline
      def setPartialRender(value: Boolean): Self = StObject.set(x, "partialRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartialRenderUndefined: Self = StObject.set(x, "partialRender", js.undefined)
      
      @scala.inline
      def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
      
      @scala.inline
      def setPlugins(value: js.Array[PluginDefinition]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      @scala.inline
      def setPluginsVarargs(value: PluginDefinition*): Self = StObject.set(x, "plugins", js.Array(value :_*))
      
      @scala.inline
      def setProgressColor(value: String): Self = StObject.set(x, "progressColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressColorUndefined: Self = StObject.set(x, "progressColor", js.undefined)
      
      @scala.inline
      def setRemoveMediaElementOnDestroy(value: Boolean): Self = StObject.set(x, "removeMediaElementOnDestroy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveMediaElementOnDestroyUndefined: Self = StObject.set(x, "removeMediaElementOnDestroy", js.undefined)
      
      @scala.inline
      def setRenderer(value: Instantiable): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
      
      @scala.inline
      def setResponsive(value: Boolean | Double): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
      
      @scala.inline
      def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      @scala.inline
      def setScrollParent(value: Boolean): Self = StObject.set(x, "scrollParent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollParentUndefined: Self = StObject.set(x, "scrollParent", js.undefined)
      
      @scala.inline
      def setSkipLength(value: Double): Self = StObject.set(x, "skipLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipLengthUndefined: Self = StObject.set(x, "skipLength", js.undefined)
      
      @scala.inline
      def setSplitChannels(value: Boolean): Self = StObject.set(x, "splitChannels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitChannelsUndefined: Self = StObject.set(x, "splitChannels", js.undefined)
      
      @scala.inline
      def setWaveColor(value: String | CanvasGradient): Self = StObject.set(x, "waveColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaveColorCanvasGradient(value: CanvasGradient): Self = StObject.set(x, "waveColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaveColorUndefined: Self = StObject.set(x, "waveColor", js.undefined)
      
      @scala.inline
      def setXhr(value: XHROptions): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXhrUndefined: Self = StObject.set(x, "xhr", js.undefined)
    }
  }
  
  @js.native
  trait WaveSurferUtil extends StObject {
    
    var Observer: typingsSlinky.wavesurferJs.mod.Observer = js.native
    
    def ajax(options: Xhr): Observer = js.native
    
    def extend(dest: js.Object, sources: js.Object*): js.Object = js.native
    
    def frame(fn: js.Function1[/* repeated */ js.Any, Unit]): js.Function1[/* repeated */ js.Any, Double] = js.native
    
    def getId(): String = js.native
    
    def max(values: js.Array[Double]): Double = js.native
    
    def min(values: js.Array[Double]): Double = js.native
    
    def preventClick(): Unit = js.native
    
    def requestAnimationFrame(): js.Function1[/* fn */ js.Function1[/* t */ Double, Unit], Double] = js.native
    
    def style(el: HTMLElement, styles: StringDictionary[String]): HTMLElement = js.native
  }
  object WaveSurferUtil {
    
    @scala.inline
    def apply(
      Observer: Observer,
      ajax: Xhr => Observer,
      extend: (js.Object, /* repeated */ js.Object) => js.Object,
      frame: js.Function1[/* repeated */ js.Any, Unit] => js.Function1[/* repeated */ js.Any, Double],
      getId: () => String,
      max: js.Array[Double] => Double,
      min: js.Array[Double] => Double,
      preventClick: () => Unit,
      requestAnimationFrame: () => js.Function1[/* fn */ js.Function1[/* t */ Double, Unit], Double],
      style: (HTMLElement, StringDictionary[String]) => HTMLElement
    ): WaveSurferUtil = {
      val __obj = js.Dynamic.literal(Observer = Observer.asInstanceOf[js.Any], ajax = js.Any.fromFunction1(ajax), extend = js.Any.fromFunction2(extend), frame = js.Any.fromFunction1(frame), getId = js.Any.fromFunction0(getId), max = js.Any.fromFunction1(max), min = js.Any.fromFunction1(min), preventClick = js.Any.fromFunction0(preventClick), requestAnimationFrame = js.Any.fromFunction0(requestAnimationFrame), style = js.Any.fromFunction2(style))
      __obj.asInstanceOf[WaveSurferUtil]
    }
    
    @scala.inline
    implicit class WaveSurferUtilMutableBuilder[Self <: WaveSurferUtil] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAjax(value: Xhr => Observer): Self = StObject.set(x, "ajax", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExtend(value: (js.Object, /* repeated */ js.Object) => js.Object): Self = StObject.set(x, "extend", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFrame(value: js.Function1[/* repeated */ js.Any, Unit] => js.Function1[/* repeated */ js.Any, Double]): Self = StObject.set(x, "frame", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetId(value: () => String): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMax(value: js.Array[Double] => Double): Self = StObject.set(x, "max", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMin(value: js.Array[Double] => Double): Self = StObject.set(x, "min", js.Any.fromFunction1(value))
      
      @scala.inline
      def setObserver(value: Observer): Self = StObject.set(x, "Observer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventClick(value: () => Unit): Self = StObject.set(x, "preventClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRequestAnimationFrame(value: () => js.Function1[/* fn */ js.Function1[/* t */ Double, Unit], Double]): Self = StObject.set(x, "requestAnimationFrame", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStyle(value: (HTMLElement, StringDictionary[String]) => HTMLElement): Self = StObject.set(x, "style", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait XHROptions extends StObject {
    
    var requestHeaders: js.UndefOr[js.Array[XHRRequestHeader]] = js.native
    
    var withCredentials: js.UndefOr[Boolean] = js.native
  }
  object XHROptions {
    
    @scala.inline
    def apply(): XHROptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XHROptions]
    }
    
    @scala.inline
    implicit class XHROptionsMutableBuilder[Self <: XHROptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequestHeaders(value: js.Array[XHRRequestHeader]): Self = StObject.set(x, "requestHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestHeadersUndefined: Self = StObject.set(x, "requestHeaders", js.undefined)
      
      @scala.inline
      def setRequestHeadersVarargs(value: XHRRequestHeader*): Self = StObject.set(x, "requestHeaders", js.Array(value :_*))
      
      @scala.inline
      def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
    }
  }
  
  @js.native
  trait XHRRequestHeader extends StObject {
    
    var key: String = js.native
    
    var value: String = js.native
  }
  object XHRRequestHeader {
    
    @scala.inline
    def apply(key: String, value: String): XHRRequestHeader = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[XHRRequestHeader]
    }
    
    @scala.inline
    implicit class XHRRequestHeaderMutableBuilder[Self <: XHRRequestHeader] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
