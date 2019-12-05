package typingsSlinky.xrm

import typingsSlinky.xrm.Xrm.Attributes.AttributeFormat
import typingsSlinky.xrm.Xrm.Attributes.AttributeType
import typingsSlinky.xrm.Xrm.Attributes.DateAttributeFormat
import typingsSlinky.xrm.Xrm.Attributes.IntegerAttributeFormat
import typingsSlinky.xrm.Xrm.Attributes.OptionSetAttributeFormat
import typingsSlinky.xrm.Xrm.Attributes.RequirementLevel
import typingsSlinky.xrm.Xrm.Attributes.StringAttributeFormat
import typingsSlinky.xrm.Xrm.Client
import typingsSlinky.xrm.Xrm.ClientState
import typingsSlinky.xrm.Xrm.Controls.NotificationLevel
import typingsSlinky.xrm.Xrm.Controls._ControlType
import typingsSlinky.xrm.Xrm.Device.PickFileTypes
import typingsSlinky.xrm.Xrm.DisplayState
import typingsSlinky.xrm.Xrm.EntitySaveMode
import typingsSlinky.xrm.Xrm.FormNotificationLevel
import typingsSlinky.xrm.Xrm.ProcessFlow.ProcessStatus
import typingsSlinky.xrm.Xrm.ProcessFlow.StageChangeDirection
import typingsSlinky.xrm.Xrm.ProcessFlow.StageStatus
import typingsSlinky.xrm.Xrm.SubmitMode
import typingsSlinky.xrm.Xrm.Theme
import typingsSlinky.xrm.Xrm.Url.CmdBarDisplay
import typingsSlinky.xrm.Xrm.Url.NavBarDisplay
import typingsSlinky.xrm.Xrm.Url.ReportAction
import typingsSlinky.xrm.XrmEnum.AdvancedConfigSettingOption
import typingsSlinky.xrm.XrmEnum.AttributeRequirementLevel
import typingsSlinky.xrm.XrmEnum.DevicePickFileType
import typingsSlinky.xrm.XrmEnum.StandardControlType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object xrmStrings {
  @js.native
  sealed trait ERROR
    extends FormNotificationLevel
       with typingsSlinky.xrm.XrmEnum.FormNotificationLevel
       with NotificationLevel
  
  @js.native
  sealed trait INFO
    extends FormNotificationLevel
       with typingsSlinky.xrm.XrmEnum.FormNotificationLevel
  
  @js.native
  sealed trait MaxChildIncidentNumber extends AdvancedConfigSettingOption
  
  @js.native
  sealed trait MaxIncidentMergeNumber extends AdvancedConfigSettingOption
  
  @js.native
  sealed trait Mobile
    extends Client
       with typingsSlinky.xrm.XrmEnum.Client
  
  @js.native
  sealed trait Next
    extends StageChangeDirection
       with typingsSlinky.xrm.XrmEnum.StageChangeDirection
  
  @js.native
  sealed trait Office12Blue
    extends Theme
       with typingsSlinky.xrm.XrmEnum.Theme
  
  @js.native
  sealed trait Office14Silver
    extends Theme
       with typingsSlinky.xrm.XrmEnum.Theme
  
  @js.native
  sealed trait Offline
    extends ClientState
       with typingsSlinky.xrm.XrmEnum.ClientState
  
  @js.native
  sealed trait Online
    extends ClientState
       with typingsSlinky.xrm.XrmEnum.ClientState
  
  @js.native
  sealed trait Outlook
    extends Client
       with typingsSlinky.xrm.XrmEnum.Client
  
  @js.native
  sealed trait Previous
    extends StageChangeDirection
       with typingsSlinky.xrm.XrmEnum.StageChangeDirection
  
  @js.native
  sealed trait RECOMMENDATION extends NotificationLevel
  
  @js.native
  sealed trait UnifiedServiceDesk
    extends Client
       with typingsSlinky.xrm.XrmEnum.Client
  
  @js.native
  sealed trait WARNING
    extends FormNotificationLevel
       with typingsSlinky.xrm.XrmEnum.FormNotificationLevel
  
  @js.native
  sealed trait Web
    extends Client
       with typingsSlinky.xrm.XrmEnum.Client
  
  @js.native
  sealed trait aborted
    extends ProcessStatus
       with typingsSlinky.xrm.XrmEnum.ProcessStatus
  
  @js.native
  sealed trait active
    extends ProcessStatus
       with typingsSlinky.xrm.XrmEnum.ProcessStatus
       with StageStatus
       with typingsSlinky.xrm.XrmEnum.StageStatus
  
  @js.native
  sealed trait always
    extends SubmitMode
       with typingsSlinky.xrm.XrmEnum.SubmitMode
  
  @js.native
  sealed trait audio
    extends DevicePickFileType
       with PickFileTypes
  
  @js.native
  sealed trait boolean
    extends AttributeType
       with typingsSlinky.xrm.XrmEnum.AttributeType
  
  @js.native
  sealed trait collapsed
    extends DisplayState
       with typingsSlinky.xrm.XrmEnum.DisplayState
  
  @js.native
  sealed trait date
    extends AttributeFormat
       with DateAttributeFormat
       with typingsSlinky.xrm.XrmEnum.DateAttributeFormat
  
  @js.native
  sealed trait datetime
    extends AttributeFormat
       with AttributeType
       with typingsSlinky.xrm.XrmEnum.AttributeType
       with DateAttributeFormat
       with typingsSlinky.xrm.XrmEnum.DateAttributeFormat
  
  @js.native
  sealed trait decimal
    extends AttributeType
       with typingsSlinky.xrm.XrmEnum.AttributeType
  
  @js.native
  sealed trait default
    extends Theme
       with typingsSlinky.xrm.XrmEnum.Theme
  
  @js.native
  sealed trait dirty
    extends SubmitMode
       with typingsSlinky.xrm.XrmEnum.SubmitMode
  
  @js.native
  sealed trait double
    extends AttributeType
       with typingsSlinky.xrm.XrmEnum.AttributeType
  
  @js.native
  sealed trait duration
    extends AttributeFormat
       with IntegerAttributeFormat
       with typingsSlinky.xrm.XrmEnum.IntegerAttributeFormat
  
  @js.native
  sealed trait email
    extends AttributeFormat
       with StringAttributeFormat
       with typingsSlinky.xrm.XrmEnum.StringAttributeFormat
  
  @js.native
  sealed trait entity
    extends NavBarDisplay
       with typingsSlinky.xrm.XrmEnum.NavBarDisplay
  
  @js.native
  sealed trait expanded
    extends DisplayState
       with typingsSlinky.xrm.XrmEnum.DisplayState
  
  @js.native
  sealed trait `false`
    extends CmdBarDisplay
       with typingsSlinky.xrm.XrmEnum.CmdBarDisplay
  
  @js.native
  sealed trait filter
    extends ReportAction
       with typingsSlinky.xrm.XrmEnum.ReportAction
  
  @js.native
  sealed trait finished
    extends ProcessStatus
       with typingsSlinky.xrm.XrmEnum.ProcessStatus
  
  @js.native
  sealed trait iframe
    extends StandardControlType
       with _ControlType
  
  @js.native
  sealed trait image
    extends DevicePickFileType
       with PickFileTypes
  
  @js.native
  sealed trait inactive
    extends StageStatus
       with typingsSlinky.xrm.XrmEnum.StageStatus
  
  @js.native
  sealed trait integer
    extends AttributeType
       with typingsSlinky.xrm.XrmEnum.AttributeType
  
  @js.native
  sealed trait kbsearch
    extends StandardControlType
       with _ControlType
  
  @js.native
  sealed trait language
    extends AttributeFormat
       with OptionSetAttributeFormat
       with typingsSlinky.xrm.XrmEnum.OptionSetAttributeFormat
  
  @js.native
  sealed trait lookup
    extends AttributeType
       with typingsSlinky.xrm.XrmEnum.AttributeType
       with StandardControlType
       with _ControlType
  
  @js.native
  sealed trait memo
    extends AttributeType
       with typingsSlinky.xrm.XrmEnum.AttributeType
  
  @js.native
  sealed trait money
    extends AttributeType
       with typingsSlinky.xrm.XrmEnum.AttributeType
  
  @js.native
  sealed trait multioptionset
    extends AttributeType
       with typingsSlinky.xrm.XrmEnum.AttributeType
  
  @js.native
  sealed trait multiselectoptionset extends StandardControlType
  
  @js.native
  sealed trait never
    extends SubmitMode
       with typingsSlinky.xrm.XrmEnum.SubmitMode
  
  @js.native
  sealed trait none
    extends AttributeFormat
       with AttributeRequirementLevel
       with IntegerAttributeFormat
       with typingsSlinky.xrm.XrmEnum.IntegerAttributeFormat
       with RequirementLevel
  
  @js.native
  sealed trait notes
    extends StandardControlType
       with _ControlType
  
  @js.native
  sealed trait off
    extends NavBarDisplay
       with typingsSlinky.xrm.XrmEnum.NavBarDisplay
  
  @js.native
  sealed trait on
    extends NavBarDisplay
       with typingsSlinky.xrm.XrmEnum.NavBarDisplay
  
  @js.native
  sealed trait optionset
    extends AttributeType
       with typingsSlinky.xrm.XrmEnum.AttributeType
       with StandardControlType
       with _ControlType
  
  @js.native
  sealed trait phone
    extends AttributeFormat
       with StringAttributeFormat
       with typingsSlinky.xrm.XrmEnum.StringAttributeFormat
  
  @js.native
  sealed trait quickform extends StandardControlType
  
  @js.native
  sealed trait recommended
    extends AttributeRequirementLevel
       with RequirementLevel
  
  @js.native
  sealed trait required
    extends AttributeRequirementLevel
       with RequirementLevel
  
  @js.native
  sealed trait run
    extends ReportAction
       with typingsSlinky.xrm.XrmEnum.ReportAction
  
  @js.native
  sealed trait saveandclose
    extends EntitySaveMode
       with typingsSlinky.xrm.XrmEnum.EntitySaveMode
  
  @js.native
  sealed trait saveandnew
    extends EntitySaveMode
       with typingsSlinky.xrm.XrmEnum.EntitySaveMode
  
  @js.native
  sealed trait standard
    extends StandardControlType
       with _ControlType
  
  @js.native
  sealed trait string
    extends AttributeType
       with typingsSlinky.xrm.XrmEnum.AttributeType
  
  @js.native
  sealed trait subgrid
    extends StandardControlType
       with _ControlType
  
  @js.native
  sealed trait text
    extends AttributeFormat
       with StringAttributeFormat
       with typingsSlinky.xrm.XrmEnum.StringAttributeFormat
  
  @js.native
  sealed trait textarea
    extends AttributeFormat
       with StringAttributeFormat
       with typingsSlinky.xrm.XrmEnum.StringAttributeFormat
  
  @js.native
  sealed trait tickersymbol
    extends AttributeFormat
       with StringAttributeFormat
       with typingsSlinky.xrm.XrmEnum.StringAttributeFormat
  
  @js.native
  sealed trait timelinewall
    extends StandardControlType
       with _ControlType
  
  @js.native
  sealed trait timercontrol
    extends StandardControlType
       with _ControlType
  
  @js.native
  sealed trait timezone
    extends AttributeFormat
       with OptionSetAttributeFormat
       with typingsSlinky.xrm.XrmEnum.OptionSetAttributeFormat
  
  @js.native
  sealed trait `true`
    extends CmdBarDisplay
       with typingsSlinky.xrm.XrmEnum.CmdBarDisplay
  
  @js.native
  sealed trait url
    extends AttributeFormat
       with StringAttributeFormat
       with typingsSlinky.xrm.XrmEnum.StringAttributeFormat
  
  @js.native
  sealed trait video
    extends DevicePickFileType
       with PickFileTypes
  
  @js.native
  sealed trait webresource
    extends StandardControlType
       with _ControlType
  
  @scala.inline
  def ERROR: ERROR = "ERROR".asInstanceOf[ERROR]
  @scala.inline
  def INFO: INFO = "INFO".asInstanceOf[INFO]
  @scala.inline
  def MaxChildIncidentNumber: MaxChildIncidentNumber = "MaxChildIncidentNumber".asInstanceOf[MaxChildIncidentNumber]
  @scala.inline
  def MaxIncidentMergeNumber: MaxIncidentMergeNumber = "MaxIncidentMergeNumber".asInstanceOf[MaxIncidentMergeNumber]
  @scala.inline
  def Mobile: Mobile = "Mobile".asInstanceOf[Mobile]
  @scala.inline
  def Next: Next = "Next".asInstanceOf[Next]
  @scala.inline
  def Office12Blue: Office12Blue = "Office12Blue".asInstanceOf[Office12Blue]
  @scala.inline
  def Office14Silver: Office14Silver = "Office14Silver".asInstanceOf[Office14Silver]
  @scala.inline
  def Offline: Offline = "Offline".asInstanceOf[Offline]
  @scala.inline
  def Online: Online = "Online".asInstanceOf[Online]
  @scala.inline
  def Outlook: Outlook = "Outlook".asInstanceOf[Outlook]
  @scala.inline
  def Previous: Previous = "Previous".asInstanceOf[Previous]
  @scala.inline
  def RECOMMENDATION: RECOMMENDATION = "RECOMMENDATION".asInstanceOf[RECOMMENDATION]
  @scala.inline
  def UnifiedServiceDesk: UnifiedServiceDesk = "UnifiedServiceDesk".asInstanceOf[UnifiedServiceDesk]
  @scala.inline
  def WARNING: WARNING = "WARNING".asInstanceOf[WARNING]
  @scala.inline
  def Web: Web = "Web".asInstanceOf[Web]
  @scala.inline
  def aborted: aborted = "aborted".asInstanceOf[aborted]
  @scala.inline
  def active: active = "active".asInstanceOf[active]
  @scala.inline
  def always: always = "always".asInstanceOf[always]
  @scala.inline
  def audio: audio = "audio".asInstanceOf[audio]
  @scala.inline
  def boolean: boolean = "boolean".asInstanceOf[boolean]
  @scala.inline
  def collapsed: collapsed = "collapsed".asInstanceOf[collapsed]
  @scala.inline
  def date: date = "date".asInstanceOf[date]
  @scala.inline
  def datetime: datetime = "datetime".asInstanceOf[datetime]
  @scala.inline
  def decimal: decimal = "decimal".asInstanceOf[decimal]
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  @scala.inline
  def dirty: dirty = "dirty".asInstanceOf[dirty]
  @scala.inline
  def double: double = "double".asInstanceOf[double]
  @scala.inline
  def duration: duration = "duration".asInstanceOf[duration]
  @scala.inline
  def email: email = "email".asInstanceOf[email]
  @scala.inline
  def entity: entity = "entity".asInstanceOf[entity]
  @scala.inline
  def expanded: expanded = "expanded".asInstanceOf[expanded]
  @scala.inline
  def `false`: `false` = "false".asInstanceOf[`false`]
  @scala.inline
  def filter: filter = "filter".asInstanceOf[filter]
  @scala.inline
  def finished: finished = "finished".asInstanceOf[finished]
  @scala.inline
  def iframe: iframe = "iframe".asInstanceOf[iframe]
  @scala.inline
  def image: image = "image".asInstanceOf[image]
  @scala.inline
  def inactive: inactive = "inactive".asInstanceOf[inactive]
  @scala.inline
  def integer: integer = "integer".asInstanceOf[integer]
  @scala.inline
  def kbsearch: kbsearch = "kbsearch".asInstanceOf[kbsearch]
  @scala.inline
  def language: language = "language".asInstanceOf[language]
  @scala.inline
  def lookup: lookup = "lookup".asInstanceOf[lookup]
  @scala.inline
  def memo: memo = "memo".asInstanceOf[memo]
  @scala.inline
  def money: money = "money".asInstanceOf[money]
  @scala.inline
  def multioptionset: multioptionset = "multioptionset".asInstanceOf[multioptionset]
  @scala.inline
  def multiselectoptionset: multiselectoptionset = "multiselectoptionset".asInstanceOf[multiselectoptionset]
  @scala.inline
  def never: never = "never".asInstanceOf[never]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def notes: notes = "notes".asInstanceOf[notes]
  @scala.inline
  def off: off = "off".asInstanceOf[off]
  @scala.inline
  def on: on = "on".asInstanceOf[on]
  @scala.inline
  def optionset: optionset = "optionset".asInstanceOf[optionset]
  @scala.inline
  def phone: phone = "phone".asInstanceOf[phone]
  @scala.inline
  def quickform: quickform = "quickform".asInstanceOf[quickform]
  @scala.inline
  def recommended: recommended = "recommended".asInstanceOf[recommended]
  @scala.inline
  def required: required = "required".asInstanceOf[required]
  @scala.inline
  def run: run = "run".asInstanceOf[run]
  @scala.inline
  def saveandclose: saveandclose = "saveandclose".asInstanceOf[saveandclose]
  @scala.inline
  def saveandnew: saveandnew = "saveandnew".asInstanceOf[saveandnew]
  @scala.inline
  def standard: standard = "standard".asInstanceOf[standard]
  @scala.inline
  def string: string = "string".asInstanceOf[string]
  @scala.inline
  def subgrid: subgrid = "subgrid".asInstanceOf[subgrid]
  @scala.inline
  def text: text = "text".asInstanceOf[text]
  @scala.inline
  def textarea: textarea = "textarea".asInstanceOf[textarea]
  @scala.inline
  def tickersymbol: tickersymbol = "tickersymbol".asInstanceOf[tickersymbol]
  @scala.inline
  def timelinewall: timelinewall = "timelinewall".asInstanceOf[timelinewall]
  @scala.inline
  def timercontrol: timercontrol = "timercontrol".asInstanceOf[timercontrol]
  @scala.inline
  def timezone: timezone = "timezone".asInstanceOf[timezone]
  @scala.inline
  def `true`: `true` = "true".asInstanceOf[`true`]
  @scala.inline
  def url: url = "url".asInstanceOf[url]
  @scala.inline
  def video: video = "video".asInstanceOf[video]
  @scala.inline
  def webresource: webresource = "webresource".asInstanceOf[webresource]
}

