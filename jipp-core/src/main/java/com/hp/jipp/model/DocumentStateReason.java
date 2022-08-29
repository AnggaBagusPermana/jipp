// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2022-08-02
//
// (Note: Uses Java, not Kotlin, to define public static values in the most efficient manner.)

package com.hp.jipp.model;

/**
 * Values applicable for "document-state-reasons" keywords.
 *
 * @see <a href="https://ftp.pwg.org/pub/pwg/ipp/registrations/reg-ippdepuri10-20211215.pdf">DEPURI</a>
 * @see <a href="https://ftp.pwg.org/pub/pwg/candidates/cs-ippjobprinterext3v10-20120727-5100.13.pdf">PWG5100.13</a>
 * @see <a href="https://ftp.pwg.org/pub/pwg/candidates/cs-ippinfra10-20150619-5100.18.pdf">PWG5100.18</a>
 * @see <a href="https://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject11-20190521-5100.5.pdf">PWG5100.5</a>
 */
public class DocumentStateReason {
    public static final String abortedBySystem = "aborted-by-system";
    public static final String canceledAtDevice = "canceled-at-device";
    public static final String canceledByOperator = "canceled-by-operator";
    public static final String canceledByUser = "canceled-by-user";
    public static final String completedSuccessfully = "completed-successfully";
    public static final String completedWithErrors = "completed-with-errors";
    public static final String completedWithWarnings = "completed-with-warnings";
    public static final String compressionError = "compression-error";
    public static final String dataInsufficient = "data-insufficient";
    public static final String digitalSignatureDidNotVerify = "digital-signature-did-not-verify";
    public static final String digitalSignatureTypeNotSupported = "digital-signature-type-not-supported";
    public static final String digitalSignatureWait = "digital-signature-wait";
    public static final String documentAccessError = "document-access-error";
    public static final String documentFetchable = "document-fetchable";
    public static final String documentFormatError = "document-format-error";
    public static final String documentPasswordError = "document-password-error";
    public static final String documentPermissionError = "document-permission-error";
    public static final String documentSecurityError = "document-security-error";
    public static final String documentUnprintableError = "document-unprintable-error";
    public static final String errorsDetected = "errors-detected";
    public static final String incoming = "incoming";
    public static final String interpreting = "interpreting";
    public static final String none = "none";
    public static final String outgoing = "outgoing";
    public static final String printing = "printing";
    public static final String processingToStopPoint = "processing-to-stop-point";
    public static final String queued = "queued";
    public static final String queuedForMarker = "queued-for-marker";
    public static final String queuedInDevice = "queued-in-device";
    public static final String resourcesAreNotReady = "resources-are-not-ready";
    public static final String resourcesAreNotSupported = "resources-are-not-supported";
    public static final String submissionInterrupted = "submission-interrupted";
    public static final String transforming = "transforming";
    public static final String unsupportedCompression = "unsupported-compression";
    public static final String unsupportedDocumentFormat = "unsupported-document-format";
    public static final String warningsDetected = "warnings-detected";
}