package typingsSlinky.webcl.WEBCL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 3.5
@js.native
trait WebCLCommandQueue extends StObject {
  
  def enqueueBarrier(): Unit = js.native
  
  ////////////////////////////////////////////////////////////////////////////
  //
  // Copying: Buffer <-> Buffer, Image <-> Image, Buffer <-> Image
  //
  def enqueueCopyBuffer(
    srcBuffer: WebCLBuffer,
    dstBuffer: WebCLBuffer,
    srcOffset: Double,
    dstOffset: Double,
    numBytes: Double
  ): Unit = js.native
  def enqueueCopyBuffer(
    srcBuffer: WebCLBuffer,
    dstBuffer: WebCLBuffer,
    srcOffset: Double,
    dstOffset: Double,
    numBytes: Double,
    eventWaitList: js.UndefOr[scala.Nothing],
    event: WebCLEvent
  ): Unit = js.native
  def enqueueCopyBuffer(
    srcBuffer: WebCLBuffer,
    dstBuffer: WebCLBuffer,
    srcOffset: Double,
    dstOffset: Double,
    numBytes: Double,
    eventWaitList: js.Array[WebCLEvent]
  ): Unit = js.native
  def enqueueCopyBuffer(
    srcBuffer: WebCLBuffer,
    dstBuffer: WebCLBuffer,
    srcOffset: Double,
    dstOffset: Double,
    numBytes: Double,
    eventWaitList: js.Array[WebCLEvent],
    event: WebCLEvent
  ): Unit = js.native
  
  def enqueueCopyBufferRect(
    srcBuffer: WebCLBuffer,
    dstBuffer: WebCLBuffer,
    srcOrigin: js.Array[Double],
    dstOrigin: js.Array[Double],
    region: js.Array[Double],
    srcRowPitch: Double,
    srcSlicePitch: Double,
    dstRowPitch: Double,
    dstSlicePitch: Double
  ): Unit = js.native
  def enqueueCopyBufferRect(
    srcBuffer: WebCLBuffer,
    dstBuffer: WebCLBuffer,
    srcOrigin: js.Array[Double],
    dstOrigin: js.Array[Double],
    region: js.Array[Double],
    srcRowPitch: Double,
    srcSlicePitch: Double,
    dstRowPitch: Double,
    dstSlicePitch: Double,
    eventWaitList: js.UndefOr[scala.Nothing],
    event: WebCLEvent
  ): Unit = js.native
  def enqueueCopyBufferRect(
    srcBuffer: WebCLBuffer,
    dstBuffer: WebCLBuffer,
    srcOrigin: js.Array[Double],
    dstOrigin: js.Array[Double],
    region: js.Array[Double],
    srcRowPitch: Double,
    srcSlicePitch: Double,
    dstRowPitch: Double,
    dstSlicePitch: Double,
    eventWaitList: js.Array[WebCLEvent]
  ): Unit = js.native
  def enqueueCopyBufferRect(
    srcBuffer: WebCLBuffer,
    dstBuffer: WebCLBuffer,
    srcOrigin: js.Array[Double],
    dstOrigin: js.Array[Double],
    region: js.Array[Double],
    srcRowPitch: Double,
    srcSlicePitch: Double,
    dstRowPitch: Double,
    dstSlicePitch: Double,
    eventWaitList: js.Array[WebCLEvent],
    event: WebCLEvent
  ): Unit = js.native
  
  def enqueueCopyBufferToImage(
    srcBuffer: WebCLBuffer,
    dstImage: WebCLImage,
    srcOffset: Double,
    dstOrigin: js.Array[Double],
    dstRegion: js.Array[Double]
  ): Unit = js.native
  def enqueueCopyBufferToImage(
    srcBuffer: WebCLBuffer,
    dstImage: WebCLImage,
    srcOffset: Double,
    dstOrigin: js.Array[Double],
    dstRegion: js.Array[Double],
    eventWaitList: js.UndefOr[scala.Nothing],
    event: WebCLEvent
  ): Unit = js.native
  def enqueueCopyBufferToImage(
    srcBuffer: WebCLBuffer,
    dstImage: WebCLImage,
    srcOffset: Double,
    dstOrigin: js.Array[Double],
    dstRegion: js.Array[Double],
    eventWaitList: js.Array[WebCLEvent]
  ): Unit = js.native
  def enqueueCopyBufferToImage(
    srcBuffer: WebCLBuffer,
    dstImage: WebCLImage,
    srcOffset: Double,
    dstOrigin: js.Array[Double],
    dstRegion: js.Array[Double],
    eventWaitList: js.Array[WebCLEvent],
    event: WebCLEvent
  ): Unit = js.native
  
  def enqueueCopyImage(
    srcImage: WebCLImage,
    dstImage: WebCLImage,
    srcOrigin: js.Array[Double],
    dstOrigin: js.Array[Double],
    region: js.Array[Double]
  ): Unit = js.native
  def enqueueCopyImage(
    srcImage: WebCLImage,
    dstImage: WebCLImage,
    srcOrigin: js.Array[Double],
    dstOrigin: js.Array[Double],
    region: js.Array[Double],
    eventWaitList: js.UndefOr[scala.Nothing],
    event: WebCLEvent
  ): Unit = js.native
  def enqueueCopyImage(
    srcImage: WebCLImage,
    dstImage: WebCLImage,
    srcOrigin: js.Array[Double],
    dstOrigin: js.Array[Double],
    region: js.Array[Double],
    eventWaitList: js.Array[WebCLEvent]
  ): Unit = js.native
  def enqueueCopyImage(
    srcImage: WebCLImage,
    dstImage: WebCLImage,
    srcOrigin: js.Array[Double],
    dstOrigin: js.Array[Double],
    region: js.Array[Double],
    eventWaitList: js.Array[WebCLEvent],
    event: WebCLEvent
  ): Unit = js.native
  
  def enqueueCopyImageToBuffer(
    srcImage: WebCLImage,
    dstBuffer: WebCLBuffer,
    srcOrigin: js.Array[Double],
    srcRegion: js.Array[Double],
    dstOffset: Double
  ): Unit = js.native
  def enqueueCopyImageToBuffer(
    srcImage: WebCLImage,
    dstBuffer: WebCLBuffer,
    srcOrigin: js.Array[Double],
    srcRegion: js.Array[Double],
    dstOffset: Double,
    eventWaitList: js.UndefOr[scala.Nothing],
    event: WebCLEvent
  ): Unit = js.native
  def enqueueCopyImageToBuffer(
    srcImage: WebCLImage,
    dstBuffer: WebCLBuffer,
    srcOrigin: js.Array[Double],
    srcRegion: js.Array[Double],
    dstOffset: Double,
    eventWaitList: js.Array[WebCLEvent]
  ): Unit = js.native
  def enqueueCopyImageToBuffer(
    srcImage: WebCLImage,
    dstBuffer: WebCLBuffer,
    srcOrigin: js.Array[Double],
    srcRegion: js.Array[Double],
    dstOffset: Double,
    eventWaitList: js.Array[WebCLEvent],
    event: WebCLEvent
  ): Unit = js.native
  
  ////////////////////////////////////////////////////////////////////////////
  //
  // Synchronization
  //
  def enqueueMarker(event: WebCLEvent): Unit = js.native
  
  ////////////////////////////////////////////////////////////////////////////
  //
  // Executing kernels
  //
  def enqueueNDRangeKernel(
    kernel: WebCLKernel,
    workDim: Double,
    globalWorkOffset: js.Array[Double],
    globalWorkSize: js.Array[Double]
  ): Unit = js.native
  def enqueueNDRangeKernel(
    kernel: WebCLKernel,
    workDim: Double,
    globalWorkOffset: js.Array[Double],
    globalWorkSize: js.Array[Double],
    localWorkSize: js.UndefOr[scala.Nothing],
    eventWaitList: js.UndefOr[scala.Nothing],
    event: WebCLEvent
  ): Unit = js.native
  def enqueueNDRangeKernel(
    kernel: WebCLKernel,
    workDim: Double,
    globalWorkOffset: js.Array[Double],
    globalWorkSize: js.Array[Double],
    localWorkSize: js.UndefOr[scala.Nothing],
    eventWaitList: js.Array[WebCLEvent]
  ): Unit = js.native
  def enqueueNDRangeKernel(
    kernel: WebCLKernel,
    workDim: Double,
    globalWorkOffset: js.Array[Double],
    globalWorkSize: js.Array[Double],
    localWorkSize: js.UndefOr[scala.Nothing],
    eventWaitList: js.Array[WebCLEvent],
    event: WebCLEvent
  ): Unit = js.native
  def enqueueNDRangeKernel(
    kernel: WebCLKernel,
    workDim: Double,
    globalWorkOffset: js.Array[Double],
    globalWorkSize: js.Array[Double],
    localWorkSize: js.Array[Double]
  ): Unit = js.native
  def enqueueNDRangeKernel(
    kernel: WebCLKernel,
    workDim: Double,
    globalWorkOffset: js.Array[Double],
    globalWorkSize: js.Array[Double],
    localWorkSize: js.Array[Double],
    eventWaitList: js.UndefOr[scala.Nothing],
    event: WebCLEvent
  ): Unit = js.native
  def enqueueNDRangeKernel(
    kernel: WebCLKernel,
    workDim: Double,
    globalWorkOffset: js.Array[Double],
    globalWorkSize: js.Array[Double],
    localWorkSize: js.Array[Double],
    eventWaitList: js.Array[WebCLEvent]
  ): Unit = js.native
  def enqueueNDRangeKernel(
    kernel: WebCLKernel,
    workDim: Double,
    globalWorkOffset: js.Array[Double],
    globalWorkSize: js.Array[Double],
    localWorkSize: js.Array[Double],
    eventWaitList: js.Array[WebCLEvent],
    event: WebCLEvent
  ): Unit = js.native
  
  ////////////////////////////////////////////////////////////////////////////
  //
  // Reading: Buffer -> Host, Image -> Host
  //
  def enqueueReadBuffer(
    buffer: WebCLBuffer,
    blockingRead: Boolean,
    bufferOffset: Double,
    numBytes: Double,
    hostPtr: js.typedarray.ArrayBufferView
  ): Unit = js.native
  def enqueueReadBuffer(
    buffer: WebCLBuffer,
    blockingRead: Boolean,
    bufferOffset: Double,
    numBytes: Double,
    hostPtr: js.typedarray.ArrayBufferView,
    eventWaitList: js.UndefOr[scala.Nothing],
    event: WebCLEvent
  ): Unit = js.native
  def enqueueReadBuffer(
    buffer: WebCLBuffer,
    blockingRead: Boolean,
    bufferOffset: Double,
    numBytes: Double,
    hostPtr: js.typedarray.ArrayBufferView,
    eventWaitList: js.Array[WebCLEvent]
  ): Unit = js.native
  def enqueueReadBuffer(
    buffer: WebCLBuffer,
    blockingRead: Boolean,
    bufferOffset: Double,
    numBytes: Double,
    hostPtr: js.typedarray.ArrayBufferView,
    eventWaitList: js.Array[WebCLEvent],
    event: WebCLEvent
  ): Unit = js.native
  
  def enqueueReadBufferRect(
    buffer: WebCLBuffer,
    blockingRead: Boolean,
    bufferOrigin: js.Array[Double],
    hostOrigin: js.Array[Double],
    region: js.Array[Double],
    bufferRowPitch: Double,
    bufferSlicePitch: Double,
    hostRowPitch: Double,
    hostSlicePitch: Double,
    hostPtr: js.typedarray.ArrayBufferView
  ): Unit = js.native
  def enqueueReadBufferRect(
    buffer: WebCLBuffer,
    blockingRead: Boolean,
    bufferOrigin: js.Array[Double],
    hostOrigin: js.Array[Double],
    region: js.Array[Double],
    bufferRowPitch: Double,
    bufferSlicePitch: Double,
    hostRowPitch: Double,
    hostSlicePitch: Double,
    hostPtr: js.typedarray.ArrayBufferView,
    eventWaitList: js.UndefOr[scala.Nothing],
    event: WebCLEvent
  ): Unit = js.native
  def enqueueReadBufferRect(
    buffer: WebCLBuffer,
    blockingRead: Boolean,
    bufferOrigin: js.Array[Double],
    hostOrigin: js.Array[Double],
    region: js.Array[Double],
    bufferRowPitch: Double,
    bufferSlicePitch: Double,
    hostRowPitch: Double,
    hostSlicePitch: Double,
    hostPtr: js.typedarray.ArrayBufferView,
    eventWaitList: js.Array[WebCLEvent]
  ): Unit = js.native
  def enqueueReadBufferRect(
    buffer: WebCLBuffer,
    blockingRead: Boolean,
    bufferOrigin: js.Array[Double],
    hostOrigin: js.Array[Double],
    region: js.Array[Double],
    bufferRowPitch: Double,
    bufferSlicePitch: Double,
    hostRowPitch: Double,
    hostSlicePitch: Double,
    hostPtr: js.typedarray.ArrayBufferView,
    eventWaitList: js.Array[WebCLEvent],
    event: WebCLEvent
  ): Unit = js.native
  
  def enqueueReadImage(
    image: WebCLImage,
    blockingRead: Boolean,
    origin: js.Array[Double],
    region: js.Array[Double],
    hostRowPitch: Double,
    hostPtr: js.typedarray.ArrayBufferView
  ): Unit = js.native
  def enqueueReadImage(
    image: WebCLImage,
    blockingRead: Boolean,
    origin: js.Array[Double],
    region: js.Array[Double],
    hostRowPitch: Double,
    hostPtr: js.typedarray.ArrayBufferView,
    eventWaitList: js.UndefOr[scala.Nothing],
    event: WebCLEvent
  ): Unit = js.native
  def enqueueReadImage(
    image: WebCLImage,
    blockingRead: Boolean,
    origin: js.Array[Double],
    region: js.Array[Double],
    hostRowPitch: Double,
    hostPtr: js.typedarray.ArrayBufferView,
    eventWaitList: js.Array[WebCLEvent]
  ): Unit = js.native
  def enqueueReadImage(
    image: WebCLImage,
    blockingRead: Boolean,
    origin: js.Array[Double],
    region: js.Array[Double],
    hostRowPitch: Double,
    hostPtr: js.typedarray.ArrayBufferView,
    eventWaitList: js.Array[WebCLEvent],
    event: WebCLEvent
  ): Unit = js.native
  
  def enqueueWaitForEvents(eventWaitList: js.Array[WebCLEvent]): Unit = js.native
  
  ////////////////////////////////////////////////////////////////////////////
  //
  // Writing: Host -> Buffer, Host -> Image
  //
  def enqueueWriteBuffer(
    buffer: WebCLBuffer,
    blockingWrite: Boolean,
    bufferOffset: Double,
    numBytes: Double,
    hostPtr: js.typedarray.ArrayBufferView
  ): Unit = js.native
  def enqueueWriteBuffer(
    buffer: WebCLBuffer,
    blockingWrite: Boolean,
    bufferOffset: Double,
    numBytes: Double,
    hostPtr: js.typedarray.ArrayBufferView,
    eventWaitList: js.UndefOr[scala.Nothing],
    event: WebCLEvent
  ): Unit = js.native
  def enqueueWriteBuffer(
    buffer: WebCLBuffer,
    blockingWrite: Boolean,
    bufferOffset: Double,
    numBytes: Double,
    hostPtr: js.typedarray.ArrayBufferView,
    eventWaitList: js.Array[WebCLEvent]
  ): Unit = js.native
  def enqueueWriteBuffer(
    buffer: WebCLBuffer,
    blockingWrite: Boolean,
    bufferOffset: Double,
    numBytes: Double,
    hostPtr: js.typedarray.ArrayBufferView,
    eventWaitList: js.Array[WebCLEvent],
    event: WebCLEvent
  ): Unit = js.native
  
  def enqueueWriteBufferRect(
    buffer: WebCLBuffer,
    blockingWrite: Boolean,
    bufferOrigin: js.Array[Double],
    hostOrigin: js.Array[Double],
    region: js.Array[Double],
    bufferRowPitch: Double,
    bufferSlicePitch: Double,
    hostRowPitch: Double,
    hostSlicePitch: Double,
    hostPtr: js.typedarray.ArrayBufferView
  ): Unit = js.native
  def enqueueWriteBufferRect(
    buffer: WebCLBuffer,
    blockingWrite: Boolean,
    bufferOrigin: js.Array[Double],
    hostOrigin: js.Array[Double],
    region: js.Array[Double],
    bufferRowPitch: Double,
    bufferSlicePitch: Double,
    hostRowPitch: Double,
    hostSlicePitch: Double,
    hostPtr: js.typedarray.ArrayBufferView,
    eventWaitList: js.UndefOr[scala.Nothing],
    event: WebCLEvent
  ): Unit = js.native
  def enqueueWriteBufferRect(
    buffer: WebCLBuffer,
    blockingWrite: Boolean,
    bufferOrigin: js.Array[Double],
    hostOrigin: js.Array[Double],
    region: js.Array[Double],
    bufferRowPitch: Double,
    bufferSlicePitch: Double,
    hostRowPitch: Double,
    hostSlicePitch: Double,
    hostPtr: js.typedarray.ArrayBufferView,
    eventWaitList: js.Array[WebCLEvent]
  ): Unit = js.native
  def enqueueWriteBufferRect(
    buffer: WebCLBuffer,
    blockingWrite: Boolean,
    bufferOrigin: js.Array[Double],
    hostOrigin: js.Array[Double],
    region: js.Array[Double],
    bufferRowPitch: Double,
    bufferSlicePitch: Double,
    hostRowPitch: Double,
    hostSlicePitch: Double,
    hostPtr: js.typedarray.ArrayBufferView,
    eventWaitList: js.Array[WebCLEvent],
    event: WebCLEvent
  ): Unit = js.native
  
  def enqueueWriteImage(
    image: WebCLImage,
    blockingWrite: Boolean,
    origin: js.Array[Double],
    region: js.Array[Double],
    hostRowPitch: Double,
    hostPtr: js.typedarray.ArrayBufferView
  ): Unit = js.native
  def enqueueWriteImage(
    image: WebCLImage,
    blockingWrite: Boolean,
    origin: js.Array[Double],
    region: js.Array[Double],
    hostRowPitch: Double,
    hostPtr: js.typedarray.ArrayBufferView,
    eventWaitList: js.UndefOr[scala.Nothing],
    event: WebCLEvent
  ): Unit = js.native
  def enqueueWriteImage(
    image: WebCLImage,
    blockingWrite: Boolean,
    origin: js.Array[Double],
    region: js.Array[Double],
    hostRowPitch: Double,
    hostPtr: js.typedarray.ArrayBufferView,
    eventWaitList: js.Array[WebCLEvent]
  ): Unit = js.native
  def enqueueWriteImage(
    image: WebCLImage,
    blockingWrite: Boolean,
    origin: js.Array[Double],
    region: js.Array[Double],
    hostRowPitch: Double,
    hostPtr: js.typedarray.ArrayBufferView,
    eventWaitList: js.Array[WebCLEvent],
    event: WebCLEvent
  ): Unit = js.native
  
  def finish(): Unit = js.native
  def finish(whenFinished: WebCLCallback): Unit = js.native
  
  def flush(): Unit = js.native
  
  ////////////////////////////////////////////////////////////////////////////
  //
  // Querying command queue information
  //
  def getInfo(name: ContextProperties): js.Any = js.native
  
  def release(): Unit = js.native
}
