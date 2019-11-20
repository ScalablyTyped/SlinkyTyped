package typingsSlinky

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object std {
  import org.scalablytyped.runtime.Instantiable1
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.std.stdStrings.FIDO_2_0
  import typingsSlinky.std.stdStrings.ScopedCred
  import typingsSlinky.std.stdStrings.`public-key`
  import typingsSlinky.std.stdStrings.auto
  import typingsSlinky.std.stdStrings.vibration

  type AAGUID = BufferSource
  type AlgorithmIdentifier = java.lang.String | org.scalajs.dom.crypto.Algorithm
  type AudioWorklet = Worklet
  type AuthenticationExtensionsSupported = js.Array[java.lang.String]
  type AuthenticatorSelectionList = js.Array[AAGUID]
  type AutoKeyword = auto
  type BigInteger = scala.scalajs.js.typedarray.Uint8Array
  type BlobCallback = js.Function1[/* blob */ org.scalajs.dom.raw.Blob | Null, Unit]
  /* Rewritten from type alias, can be one of: 
    - typings.std.BufferSource
    - typings.std.Blob
    - java.lang.String
  */
  type BlobPart = _BlobPart | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.std.Blob
    - typings.std.BufferSource
    - typings.std.FormData
    - typings.std.URLSearchParams
    - typings.std.ReadableStream[typings.std.Uint8Array]
    - java.lang.String
  */
  type BodyInit = _BodyInit | org.scalajs.dom.experimental.ReadableStream[scala.scalajs.js.typedarray.Uint8Array] | java.lang.String
  /** A CDATA section that can be used within XML to include extended portions of unescaped text. The symbols < and & don’t need escaping as they normally do when inside a CDATA section. */
  type CDATASection = org.scalajs.dom.raw.Text
  type COSEAlgorithmIdentifier = Double
  /** An object representing a single CSS @supports at-rule. It implements the CSSConditionRule interface, and therefore the CSSRule and CSSGroupingRule interfaces with a type value of 12 (CSSRule.SUPPORTS_RULE). */
  type CSSSupportsRule = CSSConditionRule
  /** The ChannelMergerNode interface, often used in conjunction with its opposite, ChannelSplitterNode, reunites different mono inputs into a single output. Each input is used to fill a channel of the output. This is useful for accessing each channels separately, e.g. for performing channel mixing where gain must be separately controlled on each channel. */
  type ChannelMergerNode = org.scalajs.dom.raw.AudioNode
  /** The ChannelSplitterNode interface, often used in conjunction with its opposite, ChannelMergerNode, separates the different channels of an audio source into a set of mono outputs. This is useful for accessing each channel separately, e.g. for performing channel mixing where gain must be separately controlled on each channel. */
  type ChannelSplitterNode = org.scalajs.dom.raw.AudioNode
  type ClassDecorator = js.Function1[/* target */ js.Function, js.Function | Unit]
  /** Textual notations within markup; although it is generally not visually shown, such comments are available to be read in the source view. */
  type Comment = org.scalajs.dom.raw.CharacterData
  type ConstrainBoolean = scala.Boolean | ConstrainBooleanParameters
  type ConstrainDOMString = java.lang.String | js.Array[java.lang.String] | ConstrainDOMStringParameters
  type ConstrainDouble = Double | ConstrainDoubleRange
  type ConstrainULong = Double | ConstrainULongRange
  /**
    * Obtain the parameters of a constructor function type in a tuple
    */
  type ConstructorParameters[T /* <: Instantiable1[/* args */ js.Any, js.Any] */] = js.Any
  type DOMHighResTimeStamp = Double
  /** Used by the dataset HTML attribute to represent data for custom attributes added to elements. */
  type DOMStringMap = StringDictionary[js.UndefOr[java.lang.String]]
  type DOMTimeStamp = Double
  type DecodeErrorCallback = js.Function1[/* error */ org.scalajs.dom.raw.DOMException, Unit]
  type DecodeSuccessCallback = js.Function1[/* decodedData */ org.scalajs.dom.raw.AudioBuffer, Unit]
  type DocumentTimeline = AnimationTimeline
  /** @deprecated Directly use HTMLElementTagNameMap or SVGElementTagNameMap as appropriate, instead. */
  type ElementTagNameMap = HTMLElementTagNameMap with (Pick[
    SVGElementTagNameMap, 
    Exclude[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 57 */ js.Any, 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any
    ]
  ])
  type EvalError = js.Error
  type EventHandlerNonNull = js.Function1[/* event */ org.scalajs.dom.raw.Event, js.Any]
  type EventListener = js.Function1[/* evt */ org.scalajs.dom.raw.Event, Unit]
  type EventListenerOrEventListenerObject = EventListener | EventListenerObject
  /**
    * Exclude from T those types that are assignable to U
    */
  type Exclude[T, U] = T
  /**
    * Extract from T those types that are assignable to U
    */
  type Extract[T, U] = T
  type Float32List = scala.scalajs.js.typedarray.Float32Array | js.Array[GLfloat]
  type ForEachCallback = js.Function2[
    /* keyId */ scala.scalajs.js.typedarray.Int8Array | scala.scalajs.js.typedarray.Int16Array | scala.scalajs.js.typedarray.Int32Array | scala.scalajs.js.typedarray.Uint8Array | scala.scalajs.js.typedarray.Uint16Array | scala.scalajs.js.typedarray.Uint32Array | scala.scalajs.js.typedarray.Uint8ClampedArray | scala.scalajs.js.typedarray.Float32Array | scala.scalajs.js.typedarray.Float64Array | scala.scalajs.js.typedarray.DataView | scala.scalajs.js.typedarray.ArrayBuffer | Null, 
    /* status */ MediaKeyStatus, 
    Unit
  ]
  type FormDataEntryValue = org.scalajs.dom.raw.File | java.lang.String
  type FrameRequestCallback = js.Function1[/* time */ Double, Unit]
  type FunctionStringCallback = js.Function1[/* data */ java.lang.String, Unit]
  type GLbitfield = Double
  type GLboolean = scala.Boolean
  type GLclampf = Double
  type GLenum = Double
  type GLfloat = Double
  type GLint = Double
  type GLint64 = Double
  type GLintptr = Double
  type GLsizei = Double
  type GLsizeiptr = Double
  type GLuint = Double
  type GLuint64 = Double
  type GamepadHapticActuatorType = vibration
  type HashAlgorithmIdentifier = AlgorithmIdentifier
  type HeadersInit = org.scalajs.dom.experimental.Headers | js.Array[js.Array[java.lang.String]] | (Record[java.lang.String, java.lang.String])
  type IDBKeyPath = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - java.lang.String
    - typings.std.Date
    - typings.std.BufferSource
    - typings.std.IDBArrayKey
  */
  type IDBValidKey = _IDBValidKey | Double | java.lang.String
  /**
    * Obtain the return type of a constructor function type
    */
  type InstanceType[T /* <: Instantiable1[/* args */ js.Any, js.Any] */] = js.Any
  type Int32List = scala.scalajs.js.typedarray.Int32Array | js.Array[GLint]
  type IntersectionObserverCallback = js.Function2[
    /* entries */ js.Array[IntersectionObserverEntry], 
    /* observer */ IntersectionObserver, 
    Unit
  ]
  type LineAndPositionSetting = Double | AutoKeyword
  type MSCredentialType = FIDO_2_0
  type MSLaunchUriCallback = js.Function0[Unit]
  type MediaStreamTrackAudioSourceNode = org.scalajs.dom.raw.AudioNode
  /* Rewritten from type alias, can be one of: 
    - typings.std.WindowProxy
    - typings.std.MessagePort
    - typings.std.ServiceWorker
  */
  type MessageEventSource = _MessageEventSource | org.scalajs.dom.raw.Window
  type MethodDecorator = js.Function3[
    /* target */ js.Object, 
    /* propertyKey */ java.lang.String | js.Symbol, 
    /* descriptor */ TypedPropertyDescriptor[js.Any], 
    TypedPropertyDescriptor[js.Any] | Unit
  ]
  /** @deprecated */
  type MouseWheelEvent = org.scalajs.dom.raw.WheelEvent
  type MutationCallback = js.Function2[
    /* mutations */ js.Array[org.scalajs.dom.raw.MutationRecord], 
    /* observer */ org.scalajs.dom.raw.MutationObserver, 
    Unit
  ]
  type NamedCurve = java.lang.String
  type NavigatorUserMediaErrorCallback = js.Function1[/* error */ MediaStreamError, Unit]
  type NavigatorUserMediaSuccessCallback = js.Function1[/* stream */ org.scalajs.dom.experimental.mediastream.MediaStream, Unit]
  /**
    * Exclude null and undefined from T
    */
  type NonNullable[T] = T
  type NotificationPermissionCallback = js.Function1[/* permission */ NotificationPermission, Unit]
  /**
    * Construct a type with the properties of T except for those in type K.
    */
  type Omit[T, K /* <: java.lang.String */] = Pick[T, Exclude[java.lang.String, K]]
  /**
    * Removes the 'this' parameter from a function type.
    */
  type OmitThisParameter[T] = T | (js.Function1[/* args */ js.Any, js.Any])
  type OnBeforeUnloadEventHandler = OnBeforeUnloadEventHandlerNonNull | Null
  type OnBeforeUnloadEventHandlerNonNull = js.Function1[/* event */ org.scalajs.dom.raw.Event, java.lang.String | Null]
  type OnErrorEventHandler = OnErrorEventHandlerNonNull | Null
  type OnErrorEventHandlerNonNull = js.Function5[
    /* event */ org.scalajs.dom.raw.Event | java.lang.String, 
    /* source */ js.UndefOr[java.lang.String], 
    /* lineno */ js.UndefOr[Double], 
    /* colno */ js.UndefOr[Double], 
    /* error */ js.UndefOr[js.Error], 
    js.Any
  ]
  type ParameterDecorator = js.Function3[
    /* target */ js.Object, 
    /* propertyKey */ java.lang.String | js.Symbol, 
    /* parameterIndex */ Double, 
    Unit
  ]
  /**
    * Obtain the parameters of a function type in a tuple
    */
  type Parameters[T /* <: js.Function1[/* args */ js.Any, _] */] = js.Any
  /**
    * Make all properties in T optional
    */
  type Partial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? T[P]}
    */ typingsSlinky.std.stdStrings.Partial with T
  type PaymentRequestUpdateEventInit = EventInit
  type PerformanceEntryList = js.Array[org.scalajs.dom.raw.PerformanceEntry]
  /** PerformanceMark is an abstract interface for PerformanceEntry objects with an entryType of "mark". Entries of this type are created by calling performance.mark() to add a named DOMHighResTimeStamp (the mark) to the browser's performance timeline. */
  type PerformanceMark = org.scalajs.dom.raw.PerformanceEntry
  /** PerformanceMeasure is an abstract interface for PerformanceEntry objects with an entryType of "measure". Entries of this type are created by calling performance.measure() to add a named DOMHighResTimeStamp (the measure) between two marks to the browser's performance timeline. */
  type PerformanceMeasure = org.scalajs.dom.raw.PerformanceEntry
  type PerformanceObserverCallback = js.Function2[/* entries */ PerformanceObserverEntryList, /* observer */ PerformanceObserver, Unit]
  /**
    * From T, pick a set of properties whose keys are in the union K
    */
  type Pick[T, K /* <: java.lang.String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in K ]: T[P]}
    */ typingsSlinky.std.stdStrings.Pick with T
  type PositionCallback = js.Function1[/* position */ org.scalajs.dom.raw.Position, Unit]
  type PositionErrorCallback = js.Function1[/* positionError */ org.scalajs.dom.raw.PositionError, Unit]
  type PromiseConstructorLike = Instantiable1[
    /* executor */ js.Function2[
      /* resolve */ js.Function1[/* value */ js.UndefOr[js.Object | js.Thenable[js.Object]], Unit], 
      /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
      Unit
    ], 
    js.Thenable[js.Object]
  ]
  type PropertyDecorator = js.Function2[/* target */ js.Object, /* propertyKey */ java.lang.String | js.Symbol, Unit]
  type PropertyDescriptorMap = StringDictionary[js.PropertyDescriptor]
  type PropertyKey = java.lang.String | Double | js.Symbol
  type PublicKeyCredentialType = `public-key`
  type QueuingStrategySizeCallback[T] = js.Function1[/* chunk */ T, Double]
  type RTCAnswerOptions = RTCOfferAnswerOptions
  type RTCPeerConnectionErrorCallback = js.Function1[/* error */ org.scalajs.dom.raw.DOMException, Unit]
  type RTCRtpDecodingParameters = RTCRtpCodingParameters
  type RTCSessionDescriptionCallback = js.Function1[
    /* description */ org.scalajs.dom.experimental.webrtc.RTCSessionDescriptionInit, 
    Unit
  ]
  type RTCStatsCallback = js.Function1[/* report */ org.scalajs.dom.experimental.webrtc.RTCStatsReport, Unit]
  type RangeError = js.Error
  type ReadableByteStreamControllerCallback = js.Function1[/* controller */ ReadableByteStreamController, Unit | js.Thenable[Unit]]
  type ReadableStreamDefaultControllerCallback[R] = js.Function1[/* controller */ ReadableStreamDefaultController[R], Unit | js.Thenable[Unit]]
  type ReadableStreamErrorCallback = js.Function1[/* reason */ js.Any, Unit | js.Thenable[Unit]]
  /**
    * Make all properties in T readonly
    */
  type Readonly[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ P in keyof T ]: T[P]}
    */ typingsSlinky.std.stdStrings.Readonly with T
  /**
    * Construct a type with a set of properties K of type T
    */
  type Record[K /* <: java.lang.String */, T] = StringDictionary[K]
  type ReferenceError = js.Error
  type RequestInfo = org.scalajs.dom.experimental.Request | java.lang.String
  /**
    * Make all properties in T required
    */
  type Required[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: -? T[P]}
    */ typingsSlinky.std.stdStrings.Required with T
  /**
    * Obtain the return type of a function type
    */
  type ReturnType[T /* <: js.Function1[/* args */ js.Any, _] */] = js.Any
  type SVGMatrix = DOMMatrix
  type SVGPathSegClosePath = org.scalajs.dom.raw.SVGPathSeg
  type SVGPoint = DOMPoint
  type SVGRect = DOMRect
  type ScopedCredentialType = ScopedCred
  type StaticRange = AbstractRange
  type SyntaxError = js.Error
  /**
    * Extracts the type of the 'this' parameter of a function type, or 'unknown' if the function type has no 'this' parameter.
    */
  type ThisParameterType[T] = js.Any
  type TimerHandler = java.lang.String | js.Function
  type TransformStreamDefaultControllerCallback[O] = js.Function1[/* controller */ TransformStreamDefaultController[O], Unit | js.Thenable[Unit]]
  type TransformStreamDefaultControllerTransformCallback[I, O] = js.Function2[
    /* chunk */ I, 
    /* controller */ TransformStreamDefaultController[O], 
    Unit | js.Thenable[Unit]
  ]
  type TypeError = js.Error
  type URIError = js.Error
  type Uint32List = scala.scalajs.js.typedarray.Uint32Array | js.Array[GLuint]
  type UvmEntries = js.Array[UvmEntry]
  type UvmEntry = js.Array[Double]
  type VibratePattern = Double | js.Array[Double]
  type VoidFunction = js.Function0[Unit]
  /** Part of the WebGL API and represents an opaque buffer object storing data such as vertices or colors. */
  type WebGLBuffer = WebGLObject
  /** Part of the WebGL API and represents a collection of buffers that serve as a rendering destination. */
  type WebGLFramebuffer = WebGLObject
  /** The WebGLProgram is part of the WebGL API and is a combination of two compiled WebGLShaders consisting of a vertex shader and a fragment shader (both written in GLSL). */
  type WebGLProgram = WebGLObject
  type WebGLQuery = WebGLObject
  /** Part of the WebGL API and represents a buffer that can contain an image, or can be source or target of an rendering operation. */
  type WebGLRenderbuffer = WebGLObject
  type WebGLSampler = WebGLObject
  /** The WebGLShader is part of the WebGL API and can either be a vertex or a fragment shader. A WebGLProgram requires both types of shaders. */
  type WebGLShader = WebGLObject
  type WebGLSync = WebGLObject
  /** Part of the WebGL API and represents an opaque texture object providing storage and state for texturing operations. */
  type WebGLTexture = WebGLObject
  type WebGLTransformFeedback = WebGLObject
  type WebGLVertexArrayObject = WebGLObject
  type WebGLVertexArrayObjectOES = WebGLObject
  type WebKitCSSMatrix = DOMMatrix
  type WindowProxy = org.scalajs.dom.raw.Window
  type WritableStreamDefaultControllerCloseCallback = js.Function0[Unit | js.Thenable[Unit]]
  type WritableStreamDefaultControllerStartCallback = js.Function1[/* controller */ WritableStreamDefaultController, Unit | js.Thenable[Unit]]
  type WritableStreamDefaultControllerWriteCallback[W] = js.Function2[
    /* chunk */ W, 
    /* controller */ WritableStreamDefaultController, 
    Unit | js.Thenable[Unit]
  ]
  type WritableStreamErrorCallback = js.Function1[/* reason */ js.Any, Unit | js.Thenable[Unit]]
  /** The XPathEvaluator interface allows to compile and evaluate XPath expressions. */
  type XPathEvaluator = XPathEvaluatorBase
  type XPathNSResolver = (js.Function1[/* prefix */ java.lang.String | Null, java.lang.String | Null]) | Anon_LookupNamespaceURI
  type webkitURL = org.scalajs.dom.experimental.URL
}
