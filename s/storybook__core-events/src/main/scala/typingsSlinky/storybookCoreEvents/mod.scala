package typingsSlinky.storybookCoreEvents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@storybook/core-events", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[events with String] = js.native
    
    /* "channelCreated" */ val CHANNEL_CREATED: typingsSlinky.storybookCoreEvents.mod.events.CHANNEL_CREATED with String = js.native
    
    /* "currentStoryWasSet" */ val CURRENT_STORY_WAS_SET: typingsSlinky.storybookCoreEvents.mod.events.CURRENT_STORY_WAS_SET with String = js.native
    
    /* "docsRendered" */ val DOCS_RENDERED: typingsSlinky.storybookCoreEvents.mod.events.DOCS_RENDERED with String = js.native
    
    /* "forceReRender" */ val FORCE_RE_RENDER: typingsSlinky.storybookCoreEvents.mod.events.FORCE_RE_RENDER with String = js.native
    
    /* "globalsUpdated" */ val GLOBALS_UPDATED: typingsSlinky.storybookCoreEvents.mod.events.GLOBALS_UPDATED with String = js.native
    
    /* "navigateUrl" */ val NAVIGATE_URL: typingsSlinky.storybookCoreEvents.mod.events.NAVIGATE_URL with String = js.native
    
    /* "previewKeydown" */ val PREVIEW_KEYDOWN: typingsSlinky.storybookCoreEvents.mod.events.PREVIEW_KEYDOWN with String = js.native
    
    /* "registerSubscription" */ val REGISTER_SUBSCRIPTION: typingsSlinky.storybookCoreEvents.mod.events.REGISTER_SUBSCRIPTION with String = js.native
    
    /* "resetStoryArgs" */ val RESET_STORY_ARGS: typingsSlinky.storybookCoreEvents.mod.events.RESET_STORY_ARGS with String = js.native
    
    /* "selectStory" */ val SELECT_STORY: typingsSlinky.storybookCoreEvents.mod.events.SELECT_STORY with String = js.native
    
    /* "setCurrentStory" */ val SET_CURRENT_STORY: typingsSlinky.storybookCoreEvents.mod.events.SET_CURRENT_STORY with String = js.native
    
    /* "setStories" */ val SET_STORIES: typingsSlinky.storybookCoreEvents.mod.events.SET_STORIES with String = js.native
    
    /* "sharedStateChanged" */ val SHARED_STATE_CHANGED: typingsSlinky.storybookCoreEvents.mod.events.SHARED_STATE_CHANGED with String = js.native
    
    /* "sharedStateSet" */ val SHARED_STATE_SET: typingsSlinky.storybookCoreEvents.mod.events.SHARED_STATE_SET with String = js.native
    
    /* "storiesCollapseAll" */ val STORIES_COLLAPSE_ALL: typingsSlinky.storybookCoreEvents.mod.events.STORIES_COLLAPSE_ALL with String = js.native
    
    /* "storiesExpandAll" */ val STORIES_EXPAND_ALL: typingsSlinky.storybookCoreEvents.mod.events.STORIES_EXPAND_ALL with String = js.native
    
    /* "storyArgsUpdated" */ val STORY_ARGS_UPDATED: typingsSlinky.storybookCoreEvents.mod.events.STORY_ARGS_UPDATED with String = js.native
    
    /* "storyChanged" */ val STORY_CHANGED: typingsSlinky.storybookCoreEvents.mod.events.STORY_CHANGED with String = js.native
    
    /* "storyErrored" */ val STORY_ERRORED: typingsSlinky.storybookCoreEvents.mod.events.STORY_ERRORED with String = js.native
    
    /* "storyMissing" */ val STORY_MISSING: typingsSlinky.storybookCoreEvents.mod.events.STORY_MISSING with String = js.native
    
    /* "storyRendered" */ val STORY_RENDERED: typingsSlinky.storybookCoreEvents.mod.events.STORY_RENDERED with String = js.native
    
    /* "storySpecified" */ val STORY_SPECIFIED: typingsSlinky.storybookCoreEvents.mod.events.STORY_SPECIFIED with String = js.native
    
    /* "storyThrewException" */ val STORY_THREW_EXCEPTION: typingsSlinky.storybookCoreEvents.mod.events.STORY_THREW_EXCEPTION with String = js.native
    
    /* "storyUnchanged" */ val STORY_UNCHANGED: typingsSlinky.storybookCoreEvents.mod.events.STORY_UNCHANGED with String = js.native
    
    /* "updateGlobals" */ val UPDATE_GLOBALS: typingsSlinky.storybookCoreEvents.mod.events.UPDATE_GLOBALS with String = js.native
    
    /* "updateStoryArgs" */ val UPDATE_STORY_ARGS: typingsSlinky.storybookCoreEvents.mod.events.UPDATE_STORY_ARGS with String = js.native
  }
  
  /* import warning: parser.TsParser#tsDeclVar Dropped IArray(STORY_SPECIFIED, SET_STORIES, SET_CURRENT_STORY, CURRENT_STORY_WAS_SET, FORCE_RE_RENDER, STORY_CHANGED, STORY_UNCHANGED, STORY_RENDERED, STORY_MISSING, STORY_ERRORED, STORY_THREW_EXCEPTION, UPDATE_STORY_ARGS, STORY_ARGS_UPDATED, RESET_STORY_ARGS, UPDATE_GLOBALS, GLOBALS_UPDATED, REGISTER_SUBSCRIPTION, PREVIEW_KEYDOWN, SELECT_STORY, STORIES_COLLAPSE_ALL, STORIES_EXPAND_ALL, DOCS_RENDERED, SHARED_STATE_CHANGED, SHARED_STATE_SET, NAVIGATE_URL) */ @JSImport("@storybook/core-events", "CHANNEL_CREATED")
  @js.native
  val CHANNEL_CREATED: events = js.native
  
  @js.native
  sealed trait events extends StObject
  @JSImport("@storybook/core-events", "events")
  @js.native
  object events extends StObject {
    
    @js.native
    sealed trait CHANNEL_CREATED extends events
    
    @js.native
    sealed trait CURRENT_STORY_WAS_SET extends events
    
    @js.native
    sealed trait DOCS_RENDERED extends events
    
    @js.native
    sealed trait FORCE_RE_RENDER extends events
    
    @js.native
    sealed trait GLOBALS_UPDATED extends events
    
    @js.native
    sealed trait NAVIGATE_URL extends events
    
    @js.native
    sealed trait PREVIEW_KEYDOWN extends events
    
    @js.native
    sealed trait REGISTER_SUBSCRIPTION extends events
    
    @js.native
    sealed trait RESET_STORY_ARGS extends events
    
    @js.native
    sealed trait SELECT_STORY extends events
    
    @js.native
    sealed trait SET_CURRENT_STORY extends events
    
    @js.native
    sealed trait SET_STORIES extends events
    
    @js.native
    sealed trait SHARED_STATE_CHANGED extends events
    
    @js.native
    sealed trait SHARED_STATE_SET extends events
    
    @js.native
    sealed trait STORIES_COLLAPSE_ALL extends events
    
    @js.native
    sealed trait STORIES_EXPAND_ALL extends events
    
    @js.native
    sealed trait STORY_ARGS_UPDATED extends events
    
    @js.native
    sealed trait STORY_CHANGED extends events
    
    @js.native
    sealed trait STORY_ERRORED extends events
    
    @js.native
    sealed trait STORY_MISSING extends events
    
    @js.native
    sealed trait STORY_RENDERED extends events
    
    @js.native
    sealed trait STORY_SPECIFIED extends events
    
    @js.native
    sealed trait STORY_THREW_EXCEPTION extends events
    
    @js.native
    sealed trait STORY_UNCHANGED extends events
    
    @js.native
    sealed trait UPDATE_GLOBALS extends events
    
    @js.native
    sealed trait UPDATE_STORY_ARGS extends events
  }
}
