package id.ac.ui.cs.advprog.everest.model;

import java.time.LocalDate;
import java.util.UUID;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
public class Coupon {

    @NonNull
    private UUID id;

    @NonNull
    private String code;

    private Long discountAmount;
    private Integer maxUsage;
    private Integer usageCount;
    private LocalDate validUntil;

    @Builder
    public Coupon(@NonNull String code, Long discountAmount, Integer maxUsage, Integer usageCount, LocalDate validUntil) {
        this.id = (id == null) ? UUID.randomUUID() : id;
        this.code = code;
        this.discountAmount = discountAmount;
        this.maxUsage = maxUsage;
        this.usageCount = usageCount;
        this.validUntil = validUntil;
    }
}
