package typingsSlinky.std

import typingsSlinky.std.stdStrings.statechange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseAudioContext extends EventTarget {
  
  @JSName("addEventListener")
  def addEventListener_statechange(
    `type`: statechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statechange(
    `type`: statechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statechange(
    `type`: statechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  val audioWorklet: AudioWorklet = js.native
  
  def createAnalyser(): org.scalajs.dom.raw.AnalyserNode = js.native
  
  def createBiquadFilter(): org.scalajs.dom.raw.BiquadFilterNode = js.native
  
  def createBuffer(numberOfChannels: Double, length: Double, sampleRate: Double): org.scalajs.dom.raw.AudioBuffer = js.native
  
  def createBufferSource(): org.scalajs.dom.raw.AudioBufferSourceNode = js.native
  
  def createChannelMerger(): org.scalajs.dom.raw.ChannelMergerNode = js.native
  def createChannelMerger(numberOfInputs: Double): org.scalajs.dom.raw.ChannelMergerNode = js.native
  
  def createChannelSplitter(): org.scalajs.dom.raw.ChannelSplitterNode = js.native
  def createChannelSplitter(numberOfOutputs: Double): org.scalajs.dom.raw.ChannelSplitterNode = js.native
  
  def createConstantSource(): ConstantSourceNode = js.native
  
  def createConvolver(): org.scalajs.dom.raw.ConvolverNode = js.native
  
  def createDelay(): org.scalajs.dom.raw.DelayNode = js.native
  def createDelay(maxDelayTime: Double): org.scalajs.dom.raw.DelayNode = js.native
  
  def createDynamicsCompressor(): org.scalajs.dom.raw.DynamicsCompressorNode = js.native
  
  def createGain(): org.scalajs.dom.raw.GainNode = js.native
  
  def createIIRFilter(feedforward: js.Array[Double], feedback: js.Array[Double]): IIRFilterNode = js.native
  def createIIRFilter(feedforward: js.Iterable[Double], feedback: js.Iterable[Double]): IIRFilterNode = js.native
  
  def createOscillator(): org.scalajs.dom.raw.OscillatorNode = js.native
  
  def createPanner(): org.scalajs.dom.raw.PannerNode = js.native
  
  def createPeriodicWave(real: js.Array[Double], imag: js.Array[Double]): org.scalajs.dom.raw.PeriodicWave = js.native
  def createPeriodicWave(real: js.Array[Double], imag: js.Array[Double], constraints: PeriodicWaveConstraints): org.scalajs.dom.raw.PeriodicWave = js.native
  def createPeriodicWave(real: js.Array[Double], imag: js.typedarray.Float32Array): org.scalajs.dom.raw.PeriodicWave = js.native
  def createPeriodicWave(real: js.Array[Double], imag: js.typedarray.Float32Array, constraints: PeriodicWaveConstraints): org.scalajs.dom.raw.PeriodicWave = js.native
  def createPeriodicWave(real: js.Iterable[Double], imag: js.Iterable[Double]): org.scalajs.dom.raw.PeriodicWave = js.native
  def createPeriodicWave(real: js.Iterable[Double], imag: js.Iterable[Double], constraints: PeriodicWaveConstraints): org.scalajs.dom.raw.PeriodicWave = js.native
  def createPeriodicWave(real: js.typedarray.Float32Array, imag: js.Array[Double]): org.scalajs.dom.raw.PeriodicWave = js.native
  def createPeriodicWave(real: js.typedarray.Float32Array, imag: js.Array[Double], constraints: PeriodicWaveConstraints): org.scalajs.dom.raw.PeriodicWave = js.native
  def createPeriodicWave(real: js.typedarray.Float32Array, imag: js.typedarray.Float32Array): org.scalajs.dom.raw.PeriodicWave = js.native
  def createPeriodicWave(
    real: js.typedarray.Float32Array,
    imag: js.typedarray.Float32Array,
    constraints: PeriodicWaveConstraints
  ): org.scalajs.dom.raw.PeriodicWave = js.native
  
  def createScriptProcessor(): ScriptProcessorNode = js.native
  def createScriptProcessor(
    bufferSize: js.UndefOr[scala.Nothing],
    numberOfInputChannels: js.UndefOr[scala.Nothing],
    numberOfOutputChannels: Double
  ): ScriptProcessorNode = js.native
  def createScriptProcessor(bufferSize: js.UndefOr[scala.Nothing], numberOfInputChannels: Double): ScriptProcessorNode = js.native
  def createScriptProcessor(
    bufferSize: js.UndefOr[scala.Nothing],
    numberOfInputChannels: Double,
    numberOfOutputChannels: Double
  ): ScriptProcessorNode = js.native
  def createScriptProcessor(bufferSize: Double): ScriptProcessorNode = js.native
  def createScriptProcessor(
    bufferSize: Double,
    numberOfInputChannels: js.UndefOr[scala.Nothing],
    numberOfOutputChannels: Double
  ): ScriptProcessorNode = js.native
  def createScriptProcessor(bufferSize: Double, numberOfInputChannels: Double): ScriptProcessorNode = js.native
  def createScriptProcessor(bufferSize: Double, numberOfInputChannels: Double, numberOfOutputChannels: Double): ScriptProcessorNode = js.native
  
  def createStereoPanner(): org.scalajs.dom.raw.StereoPannerNode = js.native
  
  def createWaveShaper(): org.scalajs.dom.raw.WaveShaperNode = js.native
  
  val currentTime: Double = js.native
  
  def decodeAudioData(audioData: js.typedarray.ArrayBuffer): js.Promise[org.scalajs.dom.raw.AudioBuffer] = js.native
  def decodeAudioData(
    audioData: js.typedarray.ArrayBuffer,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: DecodeErrorCallback
  ): js.Promise[org.scalajs.dom.raw.AudioBuffer] = js.native
  def decodeAudioData(audioData: js.typedarray.ArrayBuffer, successCallback: Null, errorCallback: DecodeErrorCallback): js.Promise[org.scalajs.dom.raw.AudioBuffer] = js.native
  def decodeAudioData(audioData: js.typedarray.ArrayBuffer, successCallback: DecodeSuccessCallback): js.Promise[org.scalajs.dom.raw.AudioBuffer] = js.native
  def decodeAudioData(
    audioData: js.typedarray.ArrayBuffer,
    successCallback: DecodeSuccessCallback,
    errorCallback: DecodeErrorCallback
  ): js.Promise[org.scalajs.dom.raw.AudioBuffer] = js.native
  
  val destination: org.scalajs.dom.raw.AudioDestinationNode = js.native
  
  val listener: org.scalajs.dom.raw.AudioListener = js.native
  
  var onstatechange: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]) | Null = js.native
  
  @JSName("removeEventListener")
  def removeEventListener_statechange(
    `type`: statechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_statechange(
    `type`: statechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: org.scalajs.dom.raw.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_statechange(
    `type`: statechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  
  val sampleRate: Double = js.native
  
  val state: AudioContextState = js.native
}
