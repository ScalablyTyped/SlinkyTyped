package typingsSlinky.vcardsJs.mod

import typingsSlinky.vcardsJs.vcardsJsStrings.F
import typingsSlinky.vcardsJs.vcardsJsStrings.M
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait vCard extends js.Object {
  /**
    * Anniversary
    */
  var anniversary: js.Date = js.native
  /**
    * Date of birth
    */
  var birthday: js.Date = js.native
  /**
    * Cell phone number
    */
  var cellPhone: String = js.native
  /**
    * The address for private electronic mail communication
    */
  var email: String = js.native
  /**
    * First name
    */
  var firstName: String = js.native
  /**
    * Formatted name string associated with the vCard object (will automatically populate if not set)
    */
  var formattedName: String = js.native
  /**
    * Gender.
    */
  var gender: M | F = js.native
  /**
    * Home mailing address
    */
  var homeAddress: Address = js.native
  /**
    * Home facsimile
    */
  var homeFax: String = js.native
  /**
    * Home phone
    */
  var homePhone: String = js.native
  /**
    * Whether or not this contact should be shown as a company
    */
  var isOrganization: Boolean = js.native
  /**
    * Last name
    */
  var lastName: String = js.native
  /**
    * Logo
    */
  var logo: Photo = js.native
  /**
    * Middle name
    */
  var middleName: String = js.native
  /**
    * Prefix for individual's name
    */
  var namePrefix: String = js.native
  /**
    * Suffix for individual's name
    */
  var nameSuffix: String = js.native
  /**
    * Nickname of individual
    */
  var nickname: String = js.native
  /**
    * Specifies supplemental information or a comment that is associated with the vCard
    */
  var note: String = js.native
  /**
    * The name and optionally the unit(s) of the organization associated with the vCard object
    */
  var organization: String = js.native
  /**
    * Other cell phone number or pager
    */
  var pagerPhone: String = js.native
  /**
    * Individual's photo
    */
  var photo: Photo = js.native
  /**
    * The role, occupation, or business category of the vCard object within an organization
    */
  var role: String = js.native
  /**
    * Social URLs attached to the vCard object (ex: Facebook, Twitter, LinkedIn)
    */
  var socialUrls: SocialUrls = js.native
  /**
    * A URL that can be used to get the latest version of this vCard
    */
  var source: String = js.native
  /**
    * Specifies the job title, functional position or function of the individual within an organization
    */
  var title: String = js.native
  /**
    * Specifies a value that represents a persistent, globally unique identifier associated with the vCard
    */
  var uid: String = js.native
  /**
    * URL pointing to a website that represents the person in some way
    */
  var url: String = js.native
  /**
    * vCard version
    */
  var version: String = js.native
  /**
    * Work mailing address
    */
  var workAddress: Address = js.native
  /**
    * The address for work-related electronic mail communication
    */
  var workEmail: String = js.native
  /**
    * Work facsimile
    */
  var workFax: String = js.native
  /**
    * Work phone
    */
  var workPhone: String = js.native
  /**
    * URL pointing to a website that represents the person's work in some way
    */
  var workUrl: String = js.native
  /**
    * Get formatted vCard
    * @return Formatted vCard in VCF format
    */
  def getFormattedString(): String = js.native
  /**
    * Get major version of the vCard format
    */
  def getMajorVersion(): Double = js.native
  /**
    * Save formatted vCard to file
    * @param filename - The file path
    */
  def saveToFile(filename: String): Unit = js.native
}

object vCard {
  @scala.inline
  def apply(
    anniversary: js.Date,
    birthday: js.Date,
    cellPhone: String,
    email: String,
    firstName: String,
    formattedName: String,
    gender: M | F,
    getFormattedString: () => String,
    getMajorVersion: () => Double,
    homeAddress: Address,
    homeFax: String,
    homePhone: String,
    isOrganization: Boolean,
    lastName: String,
    logo: Photo,
    middleName: String,
    namePrefix: String,
    nameSuffix: String,
    nickname: String,
    note: String,
    organization: String,
    pagerPhone: String,
    photo: Photo,
    role: String,
    saveToFile: String => Unit,
    socialUrls: SocialUrls,
    source: String,
    title: String,
    uid: String,
    url: String,
    version: String,
    workAddress: Address,
    workEmail: String,
    workFax: String,
    workPhone: String,
    workUrl: String
  ): vCard = {
    val __obj = js.Dynamic.literal(anniversary = anniversary.asInstanceOf[js.Any], birthday = birthday.asInstanceOf[js.Any], cellPhone = cellPhone.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], firstName = firstName.asInstanceOf[js.Any], formattedName = formattedName.asInstanceOf[js.Any], gender = gender.asInstanceOf[js.Any], getFormattedString = js.Any.fromFunction0(getFormattedString), getMajorVersion = js.Any.fromFunction0(getMajorVersion), homeAddress = homeAddress.asInstanceOf[js.Any], homeFax = homeFax.asInstanceOf[js.Any], homePhone = homePhone.asInstanceOf[js.Any], isOrganization = isOrganization.asInstanceOf[js.Any], lastName = lastName.asInstanceOf[js.Any], logo = logo.asInstanceOf[js.Any], middleName = middleName.asInstanceOf[js.Any], namePrefix = namePrefix.asInstanceOf[js.Any], nameSuffix = nameSuffix.asInstanceOf[js.Any], nickname = nickname.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any], organization = organization.asInstanceOf[js.Any], pagerPhone = pagerPhone.asInstanceOf[js.Any], photo = photo.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], saveToFile = js.Any.fromFunction1(saveToFile), socialUrls = socialUrls.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], workAddress = workAddress.asInstanceOf[js.Any], workEmail = workEmail.asInstanceOf[js.Any], workFax = workFax.asInstanceOf[js.Any], workPhone = workPhone.asInstanceOf[js.Any], workUrl = workUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[vCard]
  }
  @scala.inline
  implicit class vCardOps[Self <: vCard] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnniversary(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anniversary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBirthday(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("birthday")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellPhone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellPhone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormattedName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattedName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGender(value: M | F): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetFormattedString(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFormattedString")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMajorVersion(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMajorVersion")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHomeAddress(value: Address): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homeAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHomeFax(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homeFax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHomePhone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homePhone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsOrganization(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOrganization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogo(value: Photo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMiddleName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("middleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNamePrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namePrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNameSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameSuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNickname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nickname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNote(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrganization(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPagerPhone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagerPhone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhoto(value: Photo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSaveToFile(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveToFile")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSocialUrls(value: SocialUrls): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socialUrls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkAddress(value: Address): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkFax(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workFax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkPhone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workPhone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workUrl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

