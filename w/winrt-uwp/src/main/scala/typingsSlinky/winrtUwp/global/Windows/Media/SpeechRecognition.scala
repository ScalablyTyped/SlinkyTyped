package typingsSlinky.winrtUwp.global.Windows.Media

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IIterable
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Globalization.Language
import typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionScenario
import typingsSlinky.winrtUwp.Windows.Storage.StorageFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables speech recognition for command and control within Windows Runtime apps. */
object SpeechRecognition {
  
  /** Contains event data for the SpeechContinuousRecognitionSession.Completed event. */
  @JSGlobal("Windows.Media.SpeechRecognition.SpeechContinuousRecognitionCompletedEventArgs")
  @js.native
  abstract class SpeechContinuousRecognitionCompletedEventArgs ()
    extends typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechContinuousRecognitionCompletedEventArgs
  
  /** Specifies the behavior of the speech recognizer during a continuous recognition session. */
  @JSGlobal("Windows.Media.SpeechRecognition.SpeechContinuousRecognitionMode")
  @js.native
  object SpeechContinuousRecognitionMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechContinuousRecognitionMode with Double
      ] = js.native
    
    /* 0 */ val default: typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechContinuousRecognitionMode.default with Double = js.native
    
    /* 1 */ val pauseOnRecognition: typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechContinuousRecognitionMode.pauseOnRecognition with Double = js.native
  }
  
  /** Contains event data for the SpeechContinuousRecognitionSession.ResultGenerated event. */
  @JSGlobal("Windows.Media.SpeechRecognition.SpeechContinuousRecognitionResultGeneratedEventArgs")
  @js.native
  abstract class SpeechContinuousRecognitionResultGeneratedEventArgs ()
    extends typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechContinuousRecognitionResultGeneratedEventArgs
  
  /** Manages speech input for free-form dictation, or an arbitrary sequence of words or phrases that are defined in a grammar set. */
  @JSGlobal("Windows.Media.SpeechRecognition.SpeechContinuousRecognitionSession")
  @js.native
  abstract class SpeechContinuousRecognitionSession ()
    extends typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechContinuousRecognitionSession
  
  /** Specifies the type of audio problem detected. */
  @JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognitionAudioProblem")
  @js.native
  object SpeechRecognitionAudioProblem extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionAudioProblem with Double
      ] = js.native
    
    /* 2 */ val noSignal: typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionAudioProblem.noSignal with Double = js.native
    
    /* 0 */ val none: typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionAudioProblem.none with Double = js.native
    
    /* 5 */ val tooFast: typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionAudioProblem.tooFast with Double = js.native
    
    /* 3 */ val tooLoud: typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionAudioProblem.tooLoud with Double = js.native
    
    /* 1 */ val tooNoisy: typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionAudioProblem.tooNoisy with Double = js.native
    
    /* 4 */ val tooQuiet: typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionAudioProblem.tooQuiet with Double = js.native
    
    /* 6 */ val tooSlow: typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionAudioProblem.tooSlow with Double = js.native
  }
  
  /** The result of compiling the constraints set for a SpeechRecognizer object. */
  @JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognitionCompilationResult")
  @js.native
  abstract class SpeechRecognitionCompilationResult ()
    extends typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionCompilationResult
  
  /** Specifies confidence levels that indicate how accurately a spoken phrase was matched to a phrase in an active constraint. */
  @JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognitionConfidence")
  @js.native
  object SpeechRecognitionConfidence extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionConfidence with Double
      ] = js.native
    
    /* 0 */ val high: typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionConfidence.high with Double = js.native
    
    /* 2 */ val low: typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionConfidence.low with Double = js.native
    
    /* 1 */ val medium: typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionConfidence.medium with Double = js.native
    
    /* 3 */ val rejected: typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionConfidence.rejected with Double = js.native
  }
  
  /** Specifies the weighted value of a constraint for speech recognition. */
  @JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognitionConstraintProbability")
  @js.native
  object SpeechRecognitionConstraintProbability extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionConstraintProbability with Double
      ] = js.native
    
    /* 0 */ val default: typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionConstraintProbability.default with Double = js.native
    
    /* 2 */ val max: typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionConstraintProbability.max with Double = js.native
    
    /* 1 */ val min: typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionConstraintProbability.min with Double = js.native
  }
  
  /** Specifies the type of pre-defined grammar constraint used for speech recognition. */
  @JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognitionConstraintType")
  @js.native
  object SpeechRecognitionConstraintType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionConstraintType with Double
      ] = js.native
    
    /* 2 */ val grammar: typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionConstraintType.grammar with Double = js.native
    
    /* 1 */ val list: typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionConstraintType.list with Double = js.native
    
    /* 0 */ val topic: typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionConstraintType.topic with Double = js.native
    
    /* 3 */ val voiceCommandDefinition: typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionConstraintType.voiceCommandDefinition with Double = js.native
  }
  
  /** A constraint for a SpeechRecognizer object based on a Speech Recognition Grammar Specification (SRGS) file. */
  @JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognitionGrammarFileConstraint")
  @js.native
  class SpeechRecognitionGrammarFileConstraint protected ()
    extends typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionGrammarFileConstraint {
    /**
      * Creates an instance of the SpeechRecognitionGrammarFileConstraint class from a file object.
      * @param file An object representing a SRGS grammar file.
      */
    def this(file: StorageFile) = this()
    /**
      * Creates an instance of the SpeechRecognitionGrammarFileConstraint class from a file object and a tag.
      * @param file An object representing a SRGS grammar file.
      * @param tag The tag to assign to the constraint.
      */
    def this(file: StorageFile, tag: String) = this()
  }
  
  /** A recognition result fragment returned by the speech recognizer during an ongoing dictation session. */
  @JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognitionHypothesis")
  @js.native
  abstract class SpeechRecognitionHypothesis ()
    extends typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionHypothesis
  
  /** Contains event data for the SpeechRecognizer.HypothesisGenerated event. */
  @JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognitionHypothesisGeneratedEventArgs")
  @js.native
  abstract class SpeechRecognitionHypothesisGeneratedEventArgs ()
    extends typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionHypothesisGeneratedEventArgs
  
  /** A constraint for a SpeechRecognizer object based on a list of words or phrases. When initialized, this object is added to the Constraints collection. */
  @JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognitionListConstraint")
  @js.native
  class SpeechRecognitionListConstraint protected ()
    extends typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionListConstraint {
    /**
      * Creates an instance of the SpeechRecognitionListConstraint class from an array of words or phrases.
      * @param commands A string array of words or phrases that make up the constraint.
      */
    def this(commands: IIterable[String]) = this()
    /**
      * Creates an instance of the SpeechRecognitionListConstraint class from an array of words or phrases and a tag.
      * @param commands A string array of words or phrases that make up the constraint.
      * @param tag The tag to assign to the constraint.
      */
    def this(commands: IIterable[String], tag: String) = this()
  }
  
  /** Provides data for the SpeechRecognitionQualityDegradingEvent event. */
  @JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognitionQualityDegradingEventArgs")
  @js.native
  abstract class SpeechRecognitionQualityDegradingEventArgs ()
    extends typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionQualityDegradingEventArgs
  
  /** The result of a speech recognition session. */
  @JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognitionResult")
  @js.native
  abstract class SpeechRecognitionResult ()
    extends typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionResult
  
  /** Specifies the possible result states of a speech recognition session or from the compiling of grammar constraints. */
  @JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognitionResultStatus")
  @js.native
  object SpeechRecognitionResultStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionResultStatus with Double
      ] = js.native
    
    /* 4 */ val audioQualityFailure: typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionResultStatus.audioQualityFailure with Double = js.native
    
    /* 3 */ val grammarCompilationFailure: typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionResultStatus.grammarCompilationFailure with Double = js.native
    
    /* 2 */ val grammarLanguageMismatch: typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionResultStatus.grammarLanguageMismatch with Double = js.native
    
    /* 10 */ val microphoneUnavailable: typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionResultStatus.microphoneUnavailable with Double = js.native
    
    /* 9 */ val networkFailure: typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionResultStatus.networkFailure with Double = js.native
    
    /* 8 */ val pauseLimitExceeded: typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionResultStatus.pauseLimitExceeded with Double = js.native
    
    /* 0 */ val success: typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionResultStatus.success with Double = js.native
    
    /* 7 */ val timeoutExceeded: typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionResultStatus.timeoutExceeded with Double = js.native
    
    /* 1 */ val topicLanguageNotSupported: typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionResultStatus.topicLanguageNotSupported with Double = js.native
    
    /* 6 */ val unknown: typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionResultStatus.unknown with Double = js.native
    
    /* 5 */ val userCanceled: typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionResultStatus.userCanceled with Double = js.native
  }
  
  /** Specifies the scenario used to optimize speech recognition for a web-service constraint (created through a SpeechRecognitionTopicConstraint object). */
  @JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognitionScenario")
  @js.native
  object SpeechRecognitionScenario extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionScenario with Double
      ] = js.native
    
    /* 1 */ val dictation: typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionScenario.dictation with Double = js.native
    
    /* 2 */ val formFilling: typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionScenario.formFilling with Double = js.native
    
    /* 0 */ val webSearch: typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionScenario.webSearch with Double = js.native
  }
  
  /** Represents the semantic properties of a recognized phrase in a Speech Recognition Grammar Specification (SRGS) grammar. */
  @JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognitionSemanticInterpretation")
  @js.native
  abstract class SpeechRecognitionSemanticInterpretation ()
    extends typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionSemanticInterpretation
  
  /** A pre-defined grammar constraint (specifed by SpeechRecognitionScenario ) provided through a web service. */
  @JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognitionTopicConstraint")
  @js.native
  class SpeechRecognitionTopicConstraint protected ()
    extends typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionTopicConstraint {
    /**
      * Creates an instance of the SpeechRecognitionTopicConstraint class by using a pre-defined scenario type and context.
      * @param scenario A predefined scenario type.
      * @param topicHint A subject, or context hint, used to optimize recognition.
      */
    def this(scenario: SpeechRecognitionScenario, topicHint: String) = this()
    /**
      * Creates an instance of the SpeechRecognitionTopicConstraint class by using a pre-defined scenario type, context, and an identifier.
      * @param scenario A predefined scenario type.
      * @param topicHint A subject, or context hint, used to optimize recognition.
      * @param tag Identifier for the constraint.
      */
    def this(scenario: SpeechRecognitionScenario, topicHint: String, tag: String) = this()
  }
  
  /** A constraint for a SpeechRecognizer object based on a Voice Command Definition (VCD) file. */
  @JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognitionVoiceCommandDefinitionConstraint")
  @js.native
  abstract class SpeechRecognitionVoiceCommandDefinitionConstraint ()
    extends typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionVoiceCommandDefinitionConstraint
  
  /** Enables speech recognition with either a default or a custom graphical user interface (GUI). */
  @JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognizer")
  @js.native
  /** Creates a new instance of the SpeechRecognizer class. */
  class SpeechRecognizer ()
    extends typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognizer {
    /**
      * Creates a new instance of the SpeechRecognizer class with a language specifier.
      * @param language The spoken language to use for recognition.
      */
    def this(language: Language) = this()
  }
  object SpeechRecognizer {
    
    @JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognizer")
    @js.native
    val ^ : js.Any = js.native
    
    /** Gets the collection of languages supported by the custom grammars of the SpeechRecognitionGrammarFileConstraint and SpeechRecognitionListConstraint objects specified in the Constraints property. */
    /* static member */
    @JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognizer.supportedGrammarLanguages")
    @js.native
    def supportedGrammarLanguages: IVectorView[Language] = js.native
    @scala.inline
    def supportedGrammarLanguages_=(x: IVectorView[Language]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedGrammarLanguages")(x.asInstanceOf[js.Any])
    
    /** Gets the collection of languages supported by the pre-defined, web-service grammars of the SpeechRecognitionTopicConstraint objects specified in the Constraints property. */
    /* static member */
    @JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognizer.supportedTopicLanguages")
    @js.native
    def supportedTopicLanguages: IVectorView[Language] = js.native
    @scala.inline
    def supportedTopicLanguages_=(x: IVectorView[Language]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedTopicLanguages")(x.asInstanceOf[js.Any])
    
    /** Gets the language of the device specified in Settings > Time & Language > Speech. */
    /* static member */
    @JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognizer.systemSpeechLanguage")
    @js.native
    def systemSpeechLanguage: Language = js.native
    @scala.inline
    def systemSpeechLanguage_=(x: Language): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("systemSpeechLanguage")(x.asInstanceOf[js.Any])
  }
  
  /** Specifies the state of the speech recognizer. */
  @JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognizerState")
  @js.native
  object SpeechRecognizerState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognizerState with Double
      ] = js.native
    
    /* 1 */ val capturing: typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognizerState.capturing with Double = js.native
    
    /* 0 */ val idle: typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognizerState.idle with Double = js.native
    
    /* 6 */ val paused: typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognizerState.paused with Double = js.native
    
    /* 2 */ val processing: typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognizerState.processing with Double = js.native
    
    /* 4 */ val soundEnded: typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognizerState.soundEnded with Double = js.native
    
    /* 3 */ val soundStarted: typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognizerState.soundStarted with Double = js.native
    
    /* 5 */ val speechDetected: typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognizerState.speechDetected with Double = js.native
  }
  
  /** Provides data for the SpeechRecognizer.StateChangedEvent event. */
  @JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognizerStateChangedEventArgs")
  @js.native
  abstract class SpeechRecognizerStateChangedEventArgs ()
    extends typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognizerStateChangedEventArgs
  
  /** The timespan that a speech recognizer ignores silence or unrecognizable sounds (babble) and continues listening for speech input. */
  @JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognizerTimeouts")
  @js.native
  abstract class SpeechRecognizerTimeouts ()
    extends typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognizerTimeouts
  
  /** Specifies the UI settings for the SpeechRecognizer.RecognizeWithUIAsync method. */
  @JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognizerUIOptions")
  @js.native
  abstract class SpeechRecognizerUIOptions ()
    extends typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognizerUIOptions
}
